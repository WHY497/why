package com.java.arry;

import java.util.Arrays;
import java.util.Scanner;

public class TestArry12 {
	public static void main(String[] args) {
		//功能：给定一个数组，删除下标为2的元素
		
		//1.给定一个数组
		int [] arr = {12,34,56,7,8,9,13,999};
		
		
		//
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		
		//输入添加的数
		System.out.println("请输入一个删除数的位置第几个：");
		int num1 = sc.nextInt();
		
		//2.输出删除前的数组
		System.out.println("删除元素前的数组"+Arrays.toString(arr));
		
		//找
		
		
		//3.
		int index =num1;
		for(int i=index-1;i<=arr.length-2;i++) {
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1] =0;
		
		//4.输出删除后的数组
		System.out.println("删除元素后的数组"+Arrays.toString(arr));
	} 
}
