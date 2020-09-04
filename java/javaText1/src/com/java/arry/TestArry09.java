package com.java.arry;

import java.util.Scanner;

public class TestArry09 {
	public static void main(String[] args) {
		//功能：给定一个数组：
		int [] arr= {12,34,56,7,3,10};
		
		//
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//输入添加的第几个位置
		System.out.println("请输入添加到第几个位置：");
		int num2 = sc.nextInt();
		
		//输入添加的数
		System.out.println("请输入一个数个数：");
		int num1 = sc.nextInt();
		
		//2.输出增加元素前的数组
		System.out.print("增加元素前的数组：");
		
		for(int i=0; i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}else {
				System.out.print(arr[i]);
			}
		}
		//3.增加元素
		int index =num2-1;
		for(int i=arr.length-1;i>=index+1;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = num1;
		
		//4.输出增加元素后的数组
		System.out.print("\n增加元素后的数组：");
		
		for(int i=0; i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}else {
				System.out.print(arr[i]);
			}
		}
	}
}
