package view.menubar;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.DynamicReport;
import ar.com.fdvs.dj.domain.builders.ColumnBuilderException;
import ar.com.fdvs.dj.domain.builders.DynamicReportBuilder;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;

import db.manipulation.DbManipulation;
import db.type.DatabaseType;

public class ReportMenu extends JMenu{

	int iconWidth = 24; 
	int iconHeight = 24;
	
	public ReportMenu() {
		setText("Reports");
        this.setPreferredSize(new Dimension(80, this.getPreferredSize().height));
        JMenuItem drumskaItem=new JMenuItem("Drumska vozila");
        JMenuItem plovnaItem=new JMenuItem("Plovna vozila");
        JMenuItem istorijskeRezItem=new JMenuItem("Završene rezervacije");
        
        //ImageIcon aboutIcon=new ImageIcon("icons/menuIcons/icons8-about-30.png");
        //Image scaledAboutImage = aboutIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
        //ImageIcon scaledAboutIcon = new ImageIcon(scaledAboutImage);
        
        //aboutItem.setIcon(scaledAboutIcon);
        
        
        
    	Connection conn = DbManipulation.dbManip.get(0).getConnection();
    	
        drumskaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action to be performed when the menu item is clicked
            	try {
    				String reportPath = "reports\\DrumskaVozila.jrxml";
    				JasperReport jr = JasperCompileManager.compileReport(reportPath);
    				JasperPrint jp = JasperFillManager.fillReport(jr, null,conn);
    				JasperViewer.viewReport(jp, false);
    			} catch (JRException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
            }
        });
        
        plovnaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action to be performed when the menu item is clicked
            	try {
    				String reportPath = "reports\\Plovna vozila.jrxml";
    				JasperReport jr = JasperCompileManager.compileReport(reportPath);
    				JasperPrint jp = JasperFillManager.fillReport(jr, null,conn);
    				JasperViewer.viewReport(jp, false);
    			} catch (JRException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
            }
        });
        
        istorijskeRezItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action to be performed when the menu item is clicked
            	try {
    				String reportPath = "reports\\IstorijskeRezervacije.jrxml";
    				JasperReport jr = JasperCompileManager.compileReport(reportPath);
    				JasperPrint jp = JasperFillManager.fillReport(jr, null,conn);
    				JasperViewer.viewReport(jp, false);
    			} catch (JRException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
            }
        });
        
        add(drumskaItem);
        add(plovnaItem);
        add(istorijskeRezItem);
	}
}
