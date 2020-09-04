package com.java.utos;

import java.util.Scanner;

public class TestIf04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		会员积分x         折扣
		x>=8000            6折
		4000<=x<8000       7折
		2000<=x<4000       8折 
		x<2000             9折
		  
		



		 */
		
		//1.给出积分
		@SuppressWarnings("unused")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入会员积分:");
		//先判断键盘是否int类型
		if(sc.hasNextInt()==true) {
			//
			int score = sc.nextInt();
			//判断是否为整数
			if(score>=0) {
				if(score>=8000) {
					System.out.println("该会员享受的折扣是：0.6");
				}else if(score>=4000) {
					System.out.println("该会员享受的折扣是：0.7");
				}else if(score>=2000) {
					System.out.println("该会员享受的折扣是：0.8");
				}else  {
					System.out.println("该会员享受的折扣是：0.9");
				}
				
			}else {
				System.out.println("你输入的积分不是正数：");
			}
			
		}else {
			System.out.println("你输入的积分不是整数：");
		}
		
		
		
		//2.根据积分判断折扣
		
		
		
		 
		 
		 
	}
}
