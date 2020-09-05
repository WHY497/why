package com.td.sax;

import java.awt.List;
import java.io.File;

import javax.swing.text.html.HTMLEditorKit.Parser;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;

import org.xml.sax.SAXException;

public class SaxDocument {
	public static void main(String[] args) throws Exception {
		//1)创建解析器
		SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
		
		//2自定义DefaultHandler处理器:
		
		MyDefaultHandler2 dh = new MyDefaultHandler2();
		
		//3)开始解析
		parser.parse(new File("./src/Student.xml"),dh);
	
		java.util.List<Student> list = dh.getStudents();
		for(Student s : list) {
			System.out.println(s);
		}
	}
}
