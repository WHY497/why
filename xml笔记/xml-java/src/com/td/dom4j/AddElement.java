package com.td.dom4j;

import java.io.File;
import java.io.FileOutputStream;

import javax.swing.text.AbstractDocument.ElementEdit;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

@SuppressWarnings("unused")
public class AddElement {

	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args) throws Exception {
//		SAXReader reader = new SAXReader();
//		
//		Document doc =  reader.read(new File("./src/Student.xml"));
//		Element root = doc.getRootElement();
		
		//����һ������
		Document doc = DocumentHelper.createDocument();
		
		Element root = doc.addElement("user-list");
		
		//1)������ǩ����
		Element user = root.addElement("user");
		
		System.out.println(user);
		
		//2)����ǩ�������
		Element addAttribute = user.addAttribute("id", "W000");
		
		
		//3)����ǩ����ı�
		Element addText = user.addText("����һ����user�û�");
		
		Element name = user.addElement("name"); 
		name.addText("teacher");
		
		Element email = user.addElement("email");
		email.addText("teacher@qq.com");
		
		//���ڴ��doc���������ȥ
		@SuppressWarnings("resource")
		FileOutputStream out = new FileOutputStream( new File("D:/eclipse/xml/src/user-1.xml"));
		//��ʽ���������
		
		
		OutputFormat fmt = OutputFormat.createPrettyPrint();
		
		
		//��xml�ļ�(Document����)д��һ������
		XMLWriter writer = new XMLWriter(out,fmt);
		writer.write(doc);
		
		
		
		
		
		
		
		
		
	}
	
}
