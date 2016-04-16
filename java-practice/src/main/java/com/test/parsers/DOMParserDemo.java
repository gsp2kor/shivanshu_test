package com.test.parsers;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMParserDemo {

	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws Exception {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("./resources/employee.xml");
		
		List<Employee> empList = new ArrayList<>();
		
		NodeList nodeList = document.getDocumentElement().getChildNodes();
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			
			Node node = nodeList.item(i);
			
			if(node instanceof Element){
				Employee emp = new Employee();
				emp.id = node.getAttributes().getNamedItem("id").getNodeValue();
				
				 NodeList childNodes = node.getChildNodes();
			        for (int j = 0; j < childNodes.getLength(); j++) {
			          Node cNode = childNodes.item(j);

			          //Identifying the child tag of employee encountered. 
			          if (cNode instanceof Element) {
			            String content = cNode.getLastChild().
			                getTextContent().trim();
			            switch (cNode.getNodeName()) {
			              case "firstName":
			                emp.firstName = content;
			                break;
			              case "lastName":
			                emp.lastName = content;
			                break;
			              case "location":
			                emp.location = content;
			                break;
			            }
			          }
			        }
				
				empList.add(emp);
				
			}

			
		}
		
		for(Employee emp: empList){
			System.out.println(emp);
		}


		

	}

}
