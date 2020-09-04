package com.java.method;

import javax.imageio.ImageTypeSpecifier;
import java.util.Scanner; 
public class TestMethod03 {
	/*
	@SuppressWarnings({ "unused", "resource" })
	
	public static void  main(String[] args) {
		//功能：我心里有一个数，你来猜，是否猜对
		//1.你猜一个数
		Scanner sc = new Scanner(System.in);
		System.out.println("请你猜你一个数");
		
		int yourGuessNum = sc.nextInt();
		//2.我心里有一个数
		int myHeartNum = 5;
		//3.将两个数比对：
		
		System.out.println(yourGuessNum==myHeartNum? "猜对了":"猜错了");
	}
	*/
	
	
	
	
	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请你猜你一个数:");
		
		int yourGuessNum = sc.nextInt();
		//2.我心里有一个数
		
		
		//
		guessNum(yourGuessNum);
	
	
	}
	
	
	
	//方法的定义：功能：实现猜数功能
	public static void guessNum(int yourNum) {
		//我心里有一个数(1-6)
		int myHeartNum =(int)(Math.random()*6+1);
		//将两个数比对：
		
		System.out.println(yourNum==myHeartNum? "猜对了":"猜错了");
		System.out.println("myHeartNum:"+myHeartNum);
	}
}
