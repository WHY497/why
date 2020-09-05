package com.td.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyDefaultHandler extends DefaultHandler{
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
		System.out.println("开始解析标签");
	}

	

	/*
	 * 
	 * 开始解析标签文本内容
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println(new String(ch,start,length));
	}
 
	
	
	
	/*
	 * 解析标签结束时所触发的函数
	 * 
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out .println("$标签结束");
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
