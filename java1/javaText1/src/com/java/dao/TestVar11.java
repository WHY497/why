package com.java.dao;
import java.util.Scanner;
//还找一个地方去录入数字  import.java.util.Scanner
public class TestVar11 {
	public static void main (String [] args) {
		//实现功能：实现圆的面积和周长
		//提取变量：一劳永逸
		//
		final double PI = 3.1415926;
		//拿来一个扫描器
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//让扫描器扫描器键盘录入的 int 类型的数据：
		System.out.println("请录入一个半径：");
		int r = sc.nextInt();
		//还找一个地方去录入数字  import.java.util.Scanner
		//求周长：
		double c = 2 * PI * r;
		System.out.println("周长为："+ c);
		
		//求面积
		double s = PI * r * r;
		System.out.println("面积为："+s);
		
		
	}
}
