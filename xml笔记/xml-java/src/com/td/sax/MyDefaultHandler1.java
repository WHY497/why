package com.td.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyDefaultHandler1 extends DefaultHandler{
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
		//<student-list id="1"></student-list>
		StringBuffer sb = new StringBuffer();
		sb.append("<"+qName);
		if(attributes!=null) {
			for(int i=0;i<attributes.getLength();i++) {
				String name = attributes.getQName(i);
				String value = attributes.getValue(i);
				sb.append(" " +name+ "='"+value+"'");
			}
		}
		sb.append(">");
		System.out.println(sb);
	}

	

	/*
	 * 
	 * ��ʼ������ǩ�ı�����
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		StringBuffer sb = new StringBuffer();
		String context = new String(ch,start,length);
		String ctx = context.trim();
		
		sb.append(ctx);
		System.out.println(sb);
	}
 
	
	
	
	/*
	 * ������ǩ����ʱ���������¼�
	 * 
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		StringBuffer sb = new StringBuffer();
		sb.append("</"+qName+">");
		
		System.out.println(sb);
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
