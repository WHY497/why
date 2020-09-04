package com.java.method;

import java.util.Scanner;

public class TestMethod {
	public static int add(int num1,int num2) {
		int sum=0;
		sum+=num1;
		sum+=num2;
		
		System.out.println(sum);
		return sum;

	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("num1:");
		int num1 = input.nextInt();
		
		System.out.println("num2:");
		int num2 = input.nextInt();
		
		 
		
		System.out.println(add(num1, num2));//报错 ：此处不允许使用空类型
		
		
		
		
	}
}
