package com.java.utos;

import java.util.Random;

//多分支
public class TeastIf02 {
	public static void main(String[] args) {
		//实现一个功能：随机给出三个数（1-6），对三个数求和计算，根据和的大小来分配不同的奖品
		
		
		//1.给出三个数
				@SuppressWarnings("unused")
				int num1 = (int) (Math.random()*6)+1;;
				@SuppressWarnings("unused")
				int num2 = (int) (Math.random()*6)+1;;
				@SuppressWarnings("unused")
				int num3 = (int) (Math.random()*6)+1;;
				
				System.out.println("随机数num1:"+num1);
				System.out.println("随机数num2:"+num2);
				System.out.println("随机数num3:"+num3);
				
				
				//2.求和
				@SuppressWarnings("unused")
				int sum = 0;
				sum += num1;
				sum += num2;
				sum += num3;
				System.out.println("和为："+sum);
				
				
				
				
				//3.根据和来判断奖品
				if(sum>=14) {
					System.out.println("一等奖");
				}else if(sum>=10 ) {
					System.out.println("二等奖");
				}else if(sum>=6 ) {
					System.out.println("三等奖");
				}else {
					System.out.println("四等奖");
				}
				/*
				(3)多分支：好处只要满足一个，分支以后，后面的分支就不需要判断了，提高了效率。 
				 */
	}
}
