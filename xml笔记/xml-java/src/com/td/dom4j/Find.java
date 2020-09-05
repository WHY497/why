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
		//1.����һ��������
		SAXReader reader = new SAXReader();
		
		//2.����xml.�ļ�
		org.dom4j.Document doc = reader.read(new File("./src/Student.xml"));
		
		//3.
		//System.out.println(doc);
		
		//1)��ȡxml�ĸ���ǩ
		
		org.dom4j.Element root =  doc.getRootElement();
		
		System.out.println(root);
		@SuppressWarnings("unused")
		
		//2)getName()��ȡ��ǩ����
		String rootName= root.getName();
		System.out.println(rootName);
		
		
		//3)element(tagName) ��ȡ�����ӱ�ǩ�е�һ��tagName��ǩ����
		org.dom4j.Element student =  root.element("student");
		
		System.out.println(student);
		System.out.println("***********");
		
		
		
		//4)��ȡ����ǩ��student�ı�ǩ
//		@SuppressWarnings("unchecked")
//		java.util.List<Element>list =  root.elements("student");
//		for(Element e : list) {
//			System.out.println(e);
//		}
		
		
		//5)��ȡ����ǩ�����б�ǩ
//		System.out.println();
//		java.util.List<Element> all=root.elements();
//		for(Element e : all) {
//			System.out.println(e);
//		}
		
		
		//6)attributeValue(attributeName):�����������ƻ�ȡ
		System.out.println("----��ȡ��ǩ����----");
		String idValue =student.attributeValue("id");
		System.out.println("idValue:"+idValue);
		
		//7)attributes():��ȡ��ǰ��ǩ����������
		@SuppressWarnings("unchecked")
		java.util.List<Attribute> attrs=student.attributes();
//		for(Attribute a : attrs) {
//			//getName() getValue()��ȡ���Ե�����
//			System.out.println(a.getName());
//		}
		
		//8)attribute(Name):�������Ե����ƻ�ȡ���ԵĶ���
		org.dom4j.Attribute codeAttr = student.attribute("code");
		System.out.println(codeAttr.getName());
		
		
		System.out.println("~~~~~~��ȡ�ı���Ϣ~~~~~~~");
		//9)��ȡ�ı���ϢgetText()
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
