package com.java.arry;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestArry05 {
	
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		@SuppressWarnings("unused")
		int [] arr ={12,3,7,4,8,125,9,45};
		
		//调用方法：
		int num = getMaxNum(arr);
		System.out.println("当前数组中最大的数为："+num);
		
		 
		
	
	}
	
	
	/*
		 想提取一个方法，求数组中的最大值
		 求那个数组中的最大值---》不确定因素：那个数组(形参)---》返回值：最大值
	 */
	
	public static int getMaxNum(int [] arr) {
			int maxNum = arr[0];
			int minNum = arr[0];
			for(int i =0;i< arr.length;i++) {
				if(arr[i]>maxNum) {
					maxNum = arr[i];
					
				}else if(arr[i]<minNum){
					minNum = arr[i];
					
				}
					
			}
			return maxNum;
			
			 
	}
	

}
