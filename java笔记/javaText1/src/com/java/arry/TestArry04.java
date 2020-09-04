package com.java.arry;

public class TestArry04 {
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		//实现一个功能：给定一个数组int() arr={12,3,7,4,8,125,9,45};求出数组中最大的数
		//原理：打擂原理
		
		//1.给定一个数组
		@SuppressWarnings("unused")
		int [] arr ={12,3,7,4,8,125,9,45};
		
		
		
		//2.求出数组中的最大值
		//先找一个数上擂台，假定认为这个数最大
		int maxNum = arr[0];
		int minNum = arr[0];
		for(int i =0;i< arr.length;i++) {
			if(arr[i]>maxNum) {
				maxNum = arr[i];
			}else if(arr[i]<minNum){
				minNum = arr[i];
			}
				
		}
		System.out.println("当前数组中最大的数为："+maxNum);
		System.out.println("当前数组中最小的数为："+minNum);
				/*
		 想提取一个方法，求数组中的最大值
		 求那个数组中的最大值---》不确定因素：那个数组(形参)---》返回值：最大值
		 */
		
	}

}
