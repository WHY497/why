package com.java.dao;

import java.util.Scanner;

public class TestVar12 {
	public static void main (String[] args) {
		//键盘录入身高 姓名 年龄 性别
		//键盘录入年龄：（接收int类型数据）
		System.out.println("请你录入年龄：");
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		
		//键盘录入身高：（接收double类型数据）
		System.out.println("请录入身高：");
		double height = sc.nextDouble();
		
		
		//键盘录入姓名：（接收String 类型数据 ） --字符串
		System.out.println("请录入姓名：");
		String name = sc.next();
		
		
		
		//键盘录入性别：（接受char类型）
		System.out.println("性别：");
		String sexStr = sc.next();
		char sex = sexStr.charAt(0);
		//上面两句话可以合为一句话 表示：char sex = se.next().charAt(0);
		
		System.out.println("该学生的信息：" + " 姓名:" + name + ",性别:"+ sex + ",身高:" + height + ",年龄:" + age);
		
		
		
		
		
	}
}
