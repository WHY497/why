package com.java.dao;
//数据类型的转换
public class TestVar10 {
	public static void main(String [] args) {
		double d = 6; // int --> double  小转大   自动转换 
		System.out.println(d);
		int i = (int) 6.5;   // double --> int 大转小 强制类型转换
		System.out.println(i);
		
		//在同一个表达式中，有多个数据类型的时候，应该如何处理：
		//多种数据类型参与运算的时候，整数类型，浮点类型，字符类型都可以参与运算，唯独布尔类型的不可以参与运算。
		//double d2 = 12 + 1294L + 8.5F + 3.81 + 'a' + true;
		double d2 = 12 + 1294L + 8.5F + 3.81 + 'a' ;
		//          12.0 + 1294.0 + 8.5 + 3.81 + 97.0
		System.out.println(d2);
		/*
		 类型级别：(从低到高)
		 byte ,short, char --> int -->long --> float --> double
		 当一个表达式中有多种数据类型的时候，要找出当前表达式中级别最高的那个类型
		 其余类型都转换为当前表达式中级别最高的类型
		 
		 */
		int i2 = (int) (12 + 1294L + 8.5F + 3.81 + 'a');
		//
		//          12.0 + 1294.0 + 8.5 + 3.81 + 97.0
		System.out.println(i2);
		/*
		 在进行运算的时候：
		 左=右  ：直接赋值
		 左<右  ：强制转换
		 左>右  : 直接转换
		 */
		
		
		//特殊情况：对于byte short char  类型来说，只要在他们的表数范围之内就不需要强转
		//直接赋值
		byte b = 12;
		System.out.println(b);
		
		byte b2 = (byte) 270;
		System.out.println(b2);
		
		
		
		
	}
}
