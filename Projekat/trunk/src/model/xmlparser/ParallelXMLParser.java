package model.xmlparser;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.tree.TreeElement;
import model.tree.TreeElement.Package;

public class ParallelXMLParser implements XMLTreeParser {

	public XMLParser serialParser;
	
	Document document = null;
	XPathExpression expression = null;
	XPath xpath = null;
	
	public ParallelXMLParser() {
		this.serialParser = new XMLParser();
	}
	
	@Override
	public Package initializeTree() {
		
		Package rootPackage = null;
		
		serialParser.prepareParsing();
		this.document = serialParser.document;
		this.expression = serialParser.expression;
		this.xpath = serialParser.xpath;
		
		try {
			expression = xpath.compile("/*");
			Node root = (Node) expression.evaluate(document, XPathConstants.NODE);
			
			rootPackage = new Package();
			rootPackage.name = root.getAttributes().getNamedItem("name").getNodeValue();
			
			expression = xpath.compile("/*/package");
			NodeList packages = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
			
			SortTask sortTask = new SortTask(serialParser, packages, rootPackage, document, expression, xpath);
			ForkJoinPool pool = ForkJoinPool.commonPool();
			pool.invoke(sortTask);
			
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}

		return rootPackage;
	}

	
	public static class SortTask extends RecursiveAction {
		
		XMLParser serialParser;
		NodeList packages;
		TreeElement rootPackage;
		
		Document document;
		XPathExpression expression;
		XPath xpath;		
		
		public SortTask(XMLParser serialParser, NodeList packages, TreeElement rootPackage, Document document,
				XPathExpression expression, XPath xpath) {
			super();
			this.serialParser = serialParser;
			this.packages = packages;
			this.rootPackage = rootPackage;
			this.document = document;
			this.expression = expression;
			this.xpath = xpath;
		}

		@Override
		protected void compute() {
			for(int i = 0; i < packages.getLength(); i++) {
				
				Package tempPackage = new Package();
				tempPackage.code = null;
				tempPackage.name = packages.item(i).getAttributes().getNamedItem("name").getNodeValue();
				rootPackage.addElement(tempPackage);
				
				try {
					expression = xpath.compile("package");
					NodeList subPackages = (NodeList) expression.evaluate(packages.item(i), XPathConstants.NODESET);
					
					SortTask subpack = new SortTask(serialParser, subPackages, tempPackage, document, expression, xpath);
					invokeAll(subpack);
					
					expression = xpath.compile("table");
					NodeList tables = (NodeList) expression.evaluate(packages.item(i), XPathConstants.NODESET);
					
					serialParser.tables(tempPackage, tables);
				} catch (XPathExpressionException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
