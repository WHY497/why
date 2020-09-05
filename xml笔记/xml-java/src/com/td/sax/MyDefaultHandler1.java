package com.td.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyDefaultHandler1 extends DefaultHandler{
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
	 * 开始解析标签文本内容
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
	 * 解析标签结束时所触发的事件
	 * 
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		StringBuffer sb = new StringBuffer();
		sb.append("</"+qName+">");
		
		System.out.println(sb);
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
