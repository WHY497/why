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
	
		//1)setValue()第一种修改方式
		codeAttr.setValue("CODE001");
		
		//2)第二种修改方式addAttribute():修改时:必须时同名的属性name才可以修改
		student.addAttribute("id","Student001");
		
		//3)修改标签文本内容
		Element name = student.element("name1");
		name.setText("zhangsan");
		//把内存的doc对象输出出去
		@SuppressWarnings("resource")
		FileOutputStream out = new FileOutputStream( new File("D:/eclipse/xml/src/Eidt-user-2.xml"));
		//格式化输出内容
				
				
		OutputFormat fmt = OutputFormat.createPrettyPrint();
				
				
		//把xml文件(Document对象)写出一个对象
		XMLWriter writer = new XMLWriter(out,fmt);
		writer.write(doc);	
	}
}
