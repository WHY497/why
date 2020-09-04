package com.java.utos;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class TestFor10 {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		//请录入一个10个正整数，当输入的数是666的时候，推出游戏
		//判断其中录入正数的个数并输出
		//判断系统的退出状态，是正常还是被迫退出的
		
		
		//1.请录入一个10个正整数
		@SuppressWarnings("unused")
		Scanner sc = new Scanner(System.in);
		
		//引入一个计数器
		int count=0;
		//引入一个布尔类型变量
		boolean flag = true;//
		for(int i = 1;i<=10;i++) {
			System.out.println("请录入第"+i+"个数:");
			int num = sc.nextInt();
			if(num>0) {//录入正数的个数进行
				count++;
			}
			
			if(num==666) {
				flag=false;
				break;
			}
			
		}
		System.out.println("你录入正数的个数："+count);
		//
		
		if(flag==true) {
			System.out.println("正常退出");
		}else {
			System.out.println("被迫退出");
		}
		
		
		
	}
}
