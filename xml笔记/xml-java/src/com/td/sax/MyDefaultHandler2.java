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
	*��ʼ����document�ĵ�
	* 
	*/
	
	
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("��ʼ����Document�ĵ�");
	}


	


	
	/*
	 * ��ʼ����xml��ǩ
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
	 * ��ʼ������ǩ�ı�����
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
	 * ������ǩ����ʱ���������¼�
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
	 * �ĵ���������
	 * 
	 */
	@Override
	public void endDocument() throws SAXException {
		System.out.println("*****xml�ļ��������****");
		
		
	}
	
	
	
}
