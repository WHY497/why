package com.java.utos;

import java.util.Scanner;

public class TestWhile {
	public static void main(String[] args) {
	//1.功能：1+2+3+4+5+........
		@SuppressWarnings("unused")
		int num =1;
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入从一连加到几的数:");
		int nmu1 = sc.nextInt();
		
	//2.实现一个求和变量，用来接收求和
		@SuppressWarnings("unused")
		int sum = 0;
		
		while(num<=nmu1) {
			sum+=num;
			num++;
		}
		//num:1 sum:0;
		
		//准备开始执行第一次循环，判断num<=5是否满足 --> true -->{} 中代码执行：sum:1,num:2,第一次循环结束了
		//准备开始执行第二次循环，判断num<=5是否满足 --> true -->{} 中代码执行：sum:3,num:3,第二次循环结束了
		//准备开始执行第三次循环，判断num<=5是否满足 --> true -->{} 中代码执行：sum:6,num:4,第三次循环结束了
		//准备开始执行第四次循环，判断num<=5是否满足 --> true -->{} 中代码执行：sum:10,num:5,第四次循环结束了
		//准备开始执行第五次循环，判断num<=5是否满足 --> true -->{} 中代码执行：sum:15,num:6,第五次循环结束了
		//准备开始执行第六次循环，判断num<=5是否满足 --> false-->{} 中代码不执行:
		System.out.println("和为："+sum+"\n"+num);
	}
}
