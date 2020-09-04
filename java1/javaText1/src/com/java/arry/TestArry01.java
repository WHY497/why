package com.java.arry;
import java.util.Scanner;
public class TestArry01 {
	public static void main(String[] args) {
		//实现功能：键盘录入是个学生的成绩，求和，求平均数
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.print("请录入第"+i +"个学生的成绩：");
			@SuppressWarnings("unused")
			int score = sc.nextInt();
			sum +=score;
		}
		System.out.println("所有学生的成绩之和：" +sum);	
		System.out.println("所有学生的成绩平均数：" +sum/10);	
		
	}
}
