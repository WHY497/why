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
		
		//创建一个对象
		Document doc = DocumentHelper.createDocument();
		
		Element root = doc.addElement("user-list");
		
		//1)创建标签对象
		Element user = root.addElement("user");
		
		System.out.println(user);
		
		//2)给标签添加属性
		Element addAttribute = user.addAttribute("id", "W000");
		
		
		//3)给标签添加文本
		Element addText = user.addText("增加一个个user用户");
		
		Element name = user.addElement("name"); 
		name.addText("teacher");
		
		Element email = user.addElement("email");
		email.addText("teacher@qq.com");
		
		//把内存的doc对象输出出去
		@SuppressWarnings("resource")
		FileOutputStream out = new FileOutputStream( new File("D:/eclipse/xml/src/user-1.xml"));
		//格式化输出内容
		
		
		OutputFormat fmt = OutputFormat.createPrettyPrint();
		
		
		//把xml文件(Document对象)写出一个对象
		XMLWriter writer = new XMLWriter(out,fmt);
		writer.write(doc);
		
		
		
		
		
		
		
		
		
	}
	
}
