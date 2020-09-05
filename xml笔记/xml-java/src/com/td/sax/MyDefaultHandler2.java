package com.td.sax;

import java.awt.List;
import java.util.ArrayList;

import org.jaxen.function.SubstringAfterFunction;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyDefaultHandler2 extends DefaultHandler{
	
	private Student s;
	
	private String flag = "";
	 
	private java.util.List<Student> list = new ArrayList<Student>();
	
	public java.util.List<Student> getStudents(){
		return list;
		
	}
	
	
	/*
	*开始解析document文档
	* 
	*/
	
	
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("开始解析Document文档");
	}


	


	
	/*
	 * 开始解析xml标签
	 * 
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if("student".equals(qName)) {
			s = new Student();
			for(int i=0;i<attributes.getLength();i++) {
				String value = attributes.getValue(i);
				s.setId(value);
			}
		}
		flag = qName;
	}

	

	/*
	 * 
	 * 开始解析标签文本内容
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String context = new String(ch,start,length).trim();
		if("name".equals(flag)) {
			s.setName(context);
		}else if("gender".equals(flag)) {
			s.setGender(context);
		}else if("email".equals(flag)) {
			s.setEmail(context);
		}else if("phone".equals(flag)) {
			s.setPhone(context);
		}else if("address".equals(flag)) {
			s.setAddress(context);
		}else {
			
		}
		flag=" ";
	}
 
	
	
	
	/*
	 * 解析标签结束时所触发的事件
	 * 
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if("student".equals(qName)) {
			list.add(s);
			s = null;
			
		}
	}
	
	
	
	
	/*
	 * 文档解析结束
	 * 
	 */
	@Override
	public void endDocument() throws SAXException {
		System.out.println("*****xml文件解析完毕****");
		
		
	}
	
	
	
}
