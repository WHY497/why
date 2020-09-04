package com.java.dao;

public class TeatVar06 {
	public static void main (String[] args) {
		//浮点类型的常量有两种：
		//十进制
		double num1 = 3.14;
		System.out.println(num1);
		//科学计数法
		double num2 = 314E-2;
		System.out.println(num2);
		
		//浮点类型的变量：
		//注意:浮点类型默认十double类型的，想要是将一个double类型的数赋给float 类型，必须后面加上F或f 
		float f1 = 3.14234567898623F;
		System.out.println(f1);
		
		//double 类型后面可以加 D或d ，但是一般我们都不加
		double f2 = 3.14159261454515454545;
		System.out.println(f2);
		//注意：最好不要进行浮点类型的比较
		
		float f3 = 0.3F;
		double d2 = 0.3;
		System.out.println(f3 == d2);
	}
}
