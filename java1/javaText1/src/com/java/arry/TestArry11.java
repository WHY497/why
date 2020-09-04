package com.java.arry;

import java.util.Arrays;
import java.util.Scanner;

public class TestArry11 {
	public static void main(String[] args) {
		//功能：给定一个数组，删除指定的元素
		
		//1.给定一个数组
		int [] arr = {12,34,56,7,8,9,13,999};
		
	
		//2.输出删除前的数组
		System.out.println("删除元素前的数组"+Arrays.toString(arr));
		
		//
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//输入添加的数
		System.out.println("请输入一个数：");
		int num1 = sc.nextInt();
		
		
		//找
		int index =-1;
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]==num1) {
	    		index=i;
	    		break;
	    	}
	    }	
		
		//3.
		if(index!=-1) {
			for(int i=index;i<=arr.length-2;i++) {
				arr[i]=arr[i+1];
				
			}
			arr[arr.length-1]=0;
			System.out.println("删除元素后的数组"+Arrays.toString(arr));
		}else {
			System.out.println("没有删除的这个元素");
		}
		
		
		//4.输出删除后的数组
		
	} 
}
