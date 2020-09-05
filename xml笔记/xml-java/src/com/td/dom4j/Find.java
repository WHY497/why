package com.td.dom4j;

import java.awt.List;
import java.io.File;
import java.security.KeyStore.Entry.Attribute;

import javax.lang.model.element.Element;
import javax.swing.plaf.synth.SynthToggleButtonUI;
import javax.swing.text.Document;

import org.dom4j.io.SAXReader;

public class Find {
	

	private static char[] student;

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception{
		//1.创建一个解析器
		SAXReader reader = new SAXReader();
		
		//2.加载xml.文件
		org.dom4j.Document doc = reader.read(new File("./src/Student.xml"));
		
		//3.
		//System.out.println(doc);
		
		//1)获取xml的跟标签
		
		org.dom4j.Element root =  doc.getRootElement();
		
		System.out.println(root);
		@SuppressWarnings("unused")
		
		//2)getName()获取标签名称
		String rootName= root.getName();
		System.out.println(rootName);
		
		
		//3)element(tagName) 获取的是子标签中第一个tagName标签对象
		org.dom4j.Element student =  root.element("student");
		
		System.out.println(student);
		System.out.println("***********");
		
		
		
		//4)获取跟标签的student的标签
//		@SuppressWarnings("unchecked")
//		java.util.List<Element>list =  root.elements("student");
//		for(Element e : list) {
//			System.out.println(e);
//		}
		
		
		//5)获取根标签的所有标签
//		System.out.println();
//		java.util.List<Element> all=root.elements();
//		for(Element e : all) {
//			System.out.println(e);
//		}
		
		
		//6)attributeValue(attributeName):根据属性名称获取
		System.out.println("----获取标签属性----");
		String idValue =student.attributeValue("id");
		System.out.println("idValue:"+idValue);
		
		//7)attributes():获取当前标签的所有属性
		@SuppressWarnings("unchecked")
		java.util.List<Attribute> attrs=student.attributes();
//		for(Attribute a : attrs) {
//			//getName() getValue()获取属性的名称
//			System.out.println(a.getName());
//		}
		
		//8)attribute(Name):根据属性的名称获取属性的对象
		org.dom4j.Attribute codeAttr = student.attribute("code");
		System.out.println(codeAttr.getName());
		
		
		System.out.println("~~~~~~获取文本信息~~~~~~~");
		//9)获取文本信息getText()
		@SuppressWarnings("unused")
		//String text = student.getText();
		String text = student.getTextTrim();
		System.out.println("text:"+text);
		
		//10)elementText();
		//String name = student.elementText("name1");
		String name = student.elementTextTrim("name1");
		System.out.println("name:"+name);
		
	}
}
