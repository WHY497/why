package com.java.method;

import java.nio.charset.MalformedInputException;

public class TestMethod04 {
	public static void main(String[] args) {
		int a =10;
		int b =20;
		System.out.println("输出交换前的两个数："+a + "----"+b);//输出交换前的两个数：10----20
		changeNum(a,b);
		/*
		System.out.println("输出交换后的两个数："+a + "----"+b);//输出交换后的两个数：10----20
		*/

		
	}
	public static void changeNum(int num1,int num2) {
		int t ;
		t=num1;
		num1=num2;
		num2=t;
		System.out.println("输出交换后的两个数："+num1 + "----"+num2);
		
	}

}
