package com.td.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyDefaultHandler extends DefaultHandler{
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
		System.out.println("��ʼ������ǩ");
	}

	

	/*
	 * 
	 * ��ʼ������ǩ�ı�����
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println(new String(ch,start,length));
	}
 
	
	
	
	/*
	 * ������ǩ����ʱ�������ĺ���
	 * 
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out .println("$��ǩ����");
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
