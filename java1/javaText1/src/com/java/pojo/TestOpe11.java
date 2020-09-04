package com.java.pojo;

import java.util.Scanner;

public class TestOpe11 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//实现功能：男孩女孩选择晚饭吃什么，如果意见一致，听男生的，如果意见不一致，听女生的
		
		//1.要让男孩女孩选择晚饭吃什么；
		@SuppressWarnings("unused")
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择今晚吃什么：1.火锅  2.烧烤   3.麻辣烫  4.西餐");
		@SuppressWarnings("unused")
		int boyChoise = sc.nextInt();
		System.out.println("请女孩选择：");
		@SuppressWarnings("unused")
		int girlChoise = sc.nextInt();
		
		//2.判断
		System.out.println(boyChoise == girlChoise?"听男孩的":"听女孩的");
		
		
	}
}
