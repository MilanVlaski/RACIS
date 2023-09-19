package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import db.manipulation.*;
import model.tree.CustomTreeModel;
import model.tree.TreeElement;
import model.tree.TreeElement.Package;
public class Login {
	
	public static boolean isUserPresent(Connection connection ,String userName, String Password) throws SQLException {

        CallableStatement cs = connection.prepareCall("{call st_LogIn(?,?)}");
        cs.setString(1, userName);
        cs.setString(2, Password);

        int pid=-1;
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
             pid = rs.getInt(1);
        }

        return pid>0;

    }

	public static CustomTreeModel treeModelWithAppliedPrivileges(CustomTreeModel treeModel, String username,
			String procedure) {

		ProcedureService procService = new ProcedureService(null);

		ResultSet privileges = null;
		try {
			privileges = procService.getUserPrivileges(procedure, username);
			if (privileges != null) {
				List<TreeElement> elements = treeModel.getElements();
				setRootToRolename(treeModel, privileges);
				removeRestrictedElements(privileges, elements);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return treeModel;
	}

	private static void setRootToRolename(CustomTreeModel treeModel, ResultSet privileges) throws SQLException {
		privileges.next();
		((Package)treeModel.getRoot()).name = privileges.getString(5);
	}

	private static void removeRestrictedElements(ResultSet privileges, List<TreeElement> elements) throws SQLException {
		Iterator<TreeElement> iterator = elements.iterator();
		while(iterator.hasNext()) {
			TreeElement element = iterator.next();
			if(elementNotInPrivileges(element.name, privileges)) {
				iterator.remove();
			}
		}
	}

	private static boolean elementNotInPrivileges(String name, ResultSet privileges) throws SQLException {
		privileges.beforeFirst();
		while(privileges.next()) {
			if(name.equals(privileges.getString(3))) {
				return false;
			}
		}
		return true;
	}

}
