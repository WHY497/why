package com.java.dao;
/*
局部变量：定义在方法中 
成员变量：定义在类中，但在方法外
 */
public class TestVar04 {
	int b = 10;
	public static void main (String[] args) {
		
		//System.out.println(a);
		int a = 10;
		System.out.println(a);
		//System.out.println(b);
		
	}
	{
		int c = 40;
		System.out.println(c);
		
	}
	public void eat() {
		System.out.println(b);
		//System.out.println(a);
		int a = 30;
		System.out.println(a);
	}
}
