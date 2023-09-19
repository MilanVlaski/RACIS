package db.helper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.manipulation.DbManipulation;
import db.type.DatabaseType;

public class StoredProcedurePrinter {
    public static String printStoredProcedures(DatabaseMetaData metaData, String schemaName) throws SQLException {
    	String result = "";
        try (ResultSet procedures = metaData.getProcedures(null, schemaName, null)) {
            while (procedures.next()) {
                String procedureName = procedures.getString("PROCEDURE_NAME");
                String paramNames = printParameterNames(metaData, procedureName);
                String procName = procedureName.replace(";1", "");
                String callString = generateCallString(metaData, procName, schemaName);
                result += callString + "\n" + (paramNames != null && !paramNames.isEmpty() ? (paramNames + "\n") : "") + "\n";
            }
        }
        return result;
    }

    private static String generateCallString(DatabaseMetaData metaData, String procedureName, String schemaName) throws SQLException {
        StringBuilder callString = new StringBuilder("{call " + schemaName + ".");
        callString.append(procedureName);

        try (ResultSet parameters = metaData.getProcedureColumns(null, "pisg2", procedureName, null)) {
            List<String> paramList = new ArrayList<>();
            while (parameters.next()) {
                paramList.add("?");
            }
            paramList.remove(paramList.size()-1);
            String paramString = String.join(", ", paramList);
            callString.append("(").append(paramString).append(")}");
        }

        return callString.toString();
    }
    
    private static String printParameterNames(DatabaseMetaData metaData, String procedureName) throws SQLException {
    	List<String> paramList = new ArrayList<>();
        try (ResultSet parameters = metaData.getProcedureColumns(null, "pisg2", procedureName, null)) {
            while (parameters.next()) {
                String paramName = parameters.getString("COLUMN_NAME");
                paramList.add(paramName);
            }
        }
        paramList.remove(0);
        return String.join(", ", paramList);
    }

    public static void main(String[] args) {
        try (Connection connection = DbManipulation.createConnection(DatabaseType.MsSQL_JDBC, "78.28.157.8",
				"1435", "PIS2022", "EtfPIS2022G2", "EtfPIS2022G22918").getConnection()) {
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(printStoredProcedures(metaData, "pisg2"));
            
            File file = new File("Procedure.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(printStoredProcedures(metaData, "pisg2"));
            
            writer.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}