package com.java.pojo;

import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

@SuppressWarnings("unused")
public class TestOpe02 {
	public static void main (String [] args) {
		//实现功能：任意给出一个四位数，求出每位上的数字并输出
		//1.任意给出一个四位数
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请录入一个四位数:");
		int num = input.nextInt();
		
		//2.求出每位上的数字
		//个位数
		int num1 = num % 10;
		
		//十位数
		int num2 =num / 10 %10;
		
		
		//百位数
		int num3 = num /100 %10;
		
		//千位数
		 int num4 = num /1000;
		
		
		//3.输出每位上的数字：
		System.out.println("个位上的数字"+num1);
		System.out.println("十位上的数字"+num2);
		System.out.println("百位上的数字"+num3);
		System.out.println("千位上的数字"+num4);
		
		
		
	}
}
