package com.java.arry;

import java.util.Scanner;

public class TestArry07 {
	public static void main(String [] args) {
		//查询指定元素的位置—--》 找出元素对应的索引
		//给定一个数组
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num1 = sc.nextInt();
		int[] arr = new int[]{12,34,56,7,3,10};
		
		
		//功能：查询元素56对应的索引：
		int index = -1;
		
		for(int i=0;i<arr.length;i++) {
            if( arr[i] == num1 ) {
				index = i;//只要找到元素，那么index就变成为i
				break;
			}
		}
		
		if(index!=-1) {
			System.out.println("对应的索引:" + index);
		}else {
			System.out.println("没有这个数" );
			
		}
	}
	
	/*
	定义一个方法：查询数组中指定的元素对应的索引
	
	
	
	
	 */
	
	
}
