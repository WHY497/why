package com.java.dao;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

@SuppressWarnings("unused")
public class TestVar05 {
	public static void main(String[] args) {
		//
		//定义整数类型的变量
		int num1 = 12;//默认十十进制
		System.out.println(num1);
		int num2 = 012;//前面加上0，这个值就是八进制
		System.out.println(num2);
		int num3 = 0x12;//前面加上0x或者0X,这个值十六进制
		System.out.println(num3);
		int num4 = 0b10;//前加上0b,这个值就是二进制
		System.out.println(num4);
		
		byte b =12;
		System.out.println(b);
		//注意：超范围的赋值会报错。
		short s =30000;
		System.out.println(s);	
		
		int i = 20000;
		System.out.println(i);
		
		long num5 = 12345678910L;//在数字的末尾加L出实现 long 类型 赋值
		System.out.println(num5);
		//注意：只有这个数超出  int 类型的范围了后面才需要加上L,否则无需要加L也可以赋值给long
		
		
	}
}
