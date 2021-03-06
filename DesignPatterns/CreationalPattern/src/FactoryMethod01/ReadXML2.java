package FactoryMethod01;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXML2 {

	/*
	 * public static Object getObject() { try { DocumentBuilderFactory dFactory =
	 * DocumentBuilderFactory.newInstance(); DocumentBuilder builder =
	 * dFactory.newDocumentBuilder(); Document doc; doc = builder.parse(new
	 * File("src/FactoryMethod01/config2.xml")); NodeList nl =
	 * doc.getElementsByTagName("className"); Node classNode =
	 * nl.item(0).getFirstChild(); String cName = "FactoryMethod01." +
	 * classNode.getNodeValue(); System.out.println("新类名：" + cName); Class<?> c =
	 * Class.forName(cName); Object obj = c.newInstance(); return obj; } catch
	 * (Exception e) { e.printStackTrace(); return null; } }
	 */

	public static Object getObject() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src/FactoryMethod01/config2.xml"));
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String cName = "FactoryMethod01." + classNode.getNodeValue();
			System.out.println("新类名：" + cName);
			Class<?> c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
