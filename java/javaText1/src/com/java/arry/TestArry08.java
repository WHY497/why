package com.java.arry;

import java.util.Scanner;

public class TestArry08 {
	public static void main(String[] args) {
		int[] arrs = new int[]{12,34,56,7,3,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num1 = sc.nextInt();
		
		int index =getIndex(arrs, num1);
		
		
		if(index!=-1) {
			System.out.println("对应的索引:" + index);
		}else {
			System.out.println("没有这个数" );
			
		}
	
	
	}
	/*
	定义一个方法：查询数组中指定的元素对应的索引
	不确定因素：那个数组
	返回值：索引
	
	
	
	 */

	public static int getIndex(int []arr,int ele) {
		int index = -1;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==ele) {
				index = i;
				break;
			}
		}
		return index;
	}
}
