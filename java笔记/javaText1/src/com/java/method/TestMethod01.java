package com.java.method;
/*
 1.方法是：对特定的功能进行提取，形成一个代码1片段，这个代码片段就是我们所说的方法
 2.方法和方法是并列的，所以我们定义的方法不能写到main方法中
 3.方法的定义--》 格式：
 修饰符  方法返回值类型 方法名(形参列表){
 	方法体;
 4.提高代码的复用性
 }





*/

import java.util.Scanner;

//方法的定义
public class TestMethod01 {
	public static int add(int num1,int num2) {
		int sum=0;
		sum+=num1;
		sum+=num2;
		return sum;

	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//10+20\
		/*
		int num1=10;
		int num2=20;
		int sum = 0;
		
		sum+=num1;
		sum+=num2;
		System.out.println(sum);
		*/
		
		//方法的调用
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("num1:");
		int num1 = input.nextInt();
		
		System.out.println("num2:");
		int num2 = input.nextInt();
		
		int sum1 = add(num1, num2);
		System.out.println(sum1);
		
		
		
		
	}
}
