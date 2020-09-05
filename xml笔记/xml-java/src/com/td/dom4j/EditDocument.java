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

public class EditDocument {
	public static void main(String[] args) throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/user.xml"));
		
		Element root = doc.getRootElement();
		
		Element student = root.element("student");
		
		@SuppressWarnings("unused")
		Attribute codeAttr =  student.attribute("code");
		
		System.out.println("code:"+codeAttr);
	
		//1)setValue()��һ���޸ķ�ʽ
		codeAttr.setValue("CODE001");
		
		//2)�ڶ����޸ķ�ʽaddAttribute():�޸�ʱ:����ʱͬ��������name�ſ����޸�
		student.addAttribute("id","Student001");
		
		//3)�޸ı�ǩ�ı�����
		Element name = student.element("name1");
		name.setText("zhangsan");
		//���ڴ��doc���������ȥ
		@SuppressWarnings("resource")
		FileOutputStream out = new FileOutputStream( new File("D:/eclipse/xml/src/Eidt-user-2.xml"));
		//��ʽ���������
				
				
		OutputFormat fmt = OutputFormat.createPrettyPrint();
				
				
		//��xml�ļ�(Document����)д��һ������
		XMLWriter writer = new XMLWriter(out,fmt);
		writer.write(doc);	
	}
}
