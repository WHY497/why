package com.java.dao;

public class TestVar07 {
	public static void main(String [] args) {
    //定义字符类型的变量
	char ch1 = 'a';
	System.out.println(ch1);
	char ch2= 'A';
	System.out.println(ch2);
	char  ch3 = '4' ;
	System.out.println(ch3);
	char ch4 = '中';
	System.out.println(ch4);
	char ch5 = '?';
	System.out.println(ch5);
	//java 中无论：字母，数字，符号，中文都是字符类型的常量，都占用2个字节
	
	System.out.println(".........");
	
	char ch6 = '\n';
	System.out.println(ch6);
	System.out.println("aaa"+ch6+"bbb");
	System.out.println("aaa\nbbb");
	System.out.println("aaa\tbbb");
	System.out.println("aaa\bbbb");
	System.out.println("aaa\rbbb");
	System.out.println("\"java\"");
	
	}
}
