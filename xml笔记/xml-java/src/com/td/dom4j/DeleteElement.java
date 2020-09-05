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
		
		
		//删除标签或属性的方式
		Attribute idAttr = student.attribute("id"); 
		
		//1)属性删除，自杀式
		idAttr.detach();
		
		//2)删除name标签，他杀式
		Element name = student.element("name");
		student.remove(name);
		//把内存的doc对象输出出去
		@SuppressWarnings("resource")
		FileOutputStream out = new FileOutputStream( new File("D:/eclipse/xml/src/Delete-user-1.xml"));
		//格式化输出内容
				
				
		OutputFormat fmt = OutputFormat.createPrettyPrint();
				
				
		//把xml文件(Document对象)写出一个对象
		XMLWriter writer = new XMLWriter(out,fmt);
		writer.write(doc);		
	}
}
