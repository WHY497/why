package com.td.dom4j;

import java.awt.List;
import java.io.File;

import org.dom4j.Node;

import org.dom4j.Document;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Xpath {
	public static void main(String[] args) throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/Student.xml"));
		
		
		//1)selectNodes("Xpath���ʽ")
		//doc.selectSingleNode("Xpath���ʽ");
		
		//
		Element rootElem = doc.getRootElement();
		Node root = doc.selectSingleNode("/student-list");
		
		System.out.println("rootElem:"+rootElem);
		System.out.println("rootNode:"+root);
		
		//
		System.out.println();
		System.out.println("*******************");
		java.util.List<Node> student = doc.selectNodes("/student-list/student");
		for(Node n : student) {
			System.out.println("student�ӽڵ㣺"+n);
		}	
		
		//
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		java.util.List<Node> students1 = doc.selectNodes("/student-list//student");
		for(Node m : students1) {
			System.out.println("student��Ԫ�أ�"+m);
		}
		
		//
		System.out.println();
		System.out.println("++++++++++++++++++++");
		java.util.List<Node> students2 = doc.selectNodes("/student-list/*");
		for(Node o : students1) {
			System.out.println("student����Ԫ�أ�"+o);
		}
		
		//
		System.out.println();
		System.out.println("++++++++++++++++++++");
		java.util.List<Node> students3 = doc.selectNodes("//name");
		for(Node p : students3) {
			System.out.println("student����Ԫ�أ�"+p);
		}
		
		//
		System.out.println();
		System.out.println("-----list1-------");
		java.util.List<Node> list1 = doc.selectNodes("//student[1]");
		for(Node q : list1) {
			System.out.println("student����Ԫ�أ�"+q);
		}
		
		//
		System.out.println();
		System.out.println("+++++list2+++++");
		java.util.List<Node> list2 = doc.selectNodes("//student[last()]");
		for(Node r : list2) {
			System.out.println("student����Ԫ�أ�"+r);
		}
		
		
		System.out.println();
		java.util.List<Node> list3 = doc.selectNodes("//student[@id]");
		for(Node s : list3) {
			System.out.println("student��id��"+s);
		}
		
		
		System.out.println();
		java.util.List<Node> list4 = doc.selectNodes("//student[@id='1']");
		for(Node t : list4) {
			System.out.println("student��id��"+t);
		}
		
		
		
		System.out.println();
		System.out.println("+++++list5+++++");
		java.util.List<Node> list5 = doc.selectNodes("//name1[text()='����']");
		for(Node u : list5) {
			System.out.println("name��"+u);
		}
		
		
		
		
		
	}
}
