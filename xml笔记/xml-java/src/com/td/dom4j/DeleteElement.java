package com.td.dom4j;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.dom4j.Document;
import org.dom4j.Attribute;

public class DeleteElement {
	public static void main(String[] args) throws Exception{
		SAXReader reader = new SAXReader();
		Document doc =reader.read(new File("./src/user.xml"));
		
		Element root = doc.getRootElement();
		
		Element student = root.element("student");
		
		
		//ɾ����ǩ�����Եķ�ʽ
		Attribute idAttr = student.attribute("id"); 
		
		//1)����ɾ������ɱʽ
		idAttr.detach();
		
		//2)ɾ��name��ǩ����ɱʽ
		Element name = student.element("name");
		student.remove(name);
		//���ڴ��doc���������ȥ
		@SuppressWarnings("resource")
		FileOutputStream out = new FileOutputStream( new File("D:/eclipse/xml/src/Delete-user-1.xml"));
		//��ʽ���������
				
				
		OutputFormat fmt = OutputFormat.createPrettyPrint();
				
				
		//��xml�ļ�(Document����)д��һ������
		XMLWriter writer = new XMLWriter(out,fmt);
		writer.write(doc);		
	}
}
