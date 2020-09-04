package com.java.dao;

public class TeatVar08 {
	public static void main(String[] args) {
	char ch1 = 'A';	
	System.out.println(ch1);//A
	System.out.println(ch1+90);//155
	System.out.println(155-ch1);//90
	//char类型我们看到的字面常量就是它本身的样子，
	//char 类型我们看到的样子就是它本身的字面常量。但是底层在进行计算的时候，实际上按照一定格码进行计算的。
	//这个码就是ASCII
	//之前说char类型是按照Unicode码表进行存储的。
	
	char ch2 = '中';
	System.out.println(ch2);//中
	System.out.println(ch2+90);//20103
	System.out.println(20103-ch2);//
	
	int num1 = (int)ch2;
	System.out.println(num1);
	char ch6 = '2' + 2; // ASCII码'2'--> 50 50+2=52  ASCII 52-->'4'
	System.out.println(ch6);
	}
}
