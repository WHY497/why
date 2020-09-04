package com.java.arry;

import java.util.Arrays;

public class TestArry14 {
	//四、arry工具类的使用
	public static void main(String[] args) {
		//给定一个数组
		@SuppressWarnings("unused")
		int [] arr = {1,3,7,2,4,8};
		//toString:对数组遍历查看的，返回的是一个字符串，这个字符串比较好看
		System.out.println(Arrays.toString((arr)));
		
		
		//binarySearch:二分法查找：找出指定数组的指定元素对应的索引
		//这方法的使用，对有序的数组有效，无序无效，必须将数组有序排列
		
		Arrays.sort(arr);//sort:升序
		System.out.println(Arrays.toString((arr)));
		System.out.println(Arrays.binarySearch(arr,4));
		
		int [] arr2 = {1, 2, 3, 4, 7, 8};
		//copyOf:完成数组的复制
		int [] newArr = Arrays.copyOf(arr2,4);
		
		System.out.println(Arrays.toString((newArr)));
		
		
		//copyOfRange:区间的复制
		
		int [] newArr2 = Arrays.copyOfRange(arr2,1,4);//[1,4) ---> 1,2,3位置
		System.out.println(Arrays.toString((newArr2)));
		
		
		//equals:比较两个数组的值是否一样：
		int [] arr3 = {1,3,7,2,4,8};
		int [] arr4 = {1,3,7,2,4,8};
		System.out.println(Arrays.equals(arr3, arr4));//true
		System.out.println(arr3==arr4);//false,比较的是两侧的值是否相等，比较的是地址值。
		
		
		
		//fill:数组的填充
		int [] arr5 = {1,2,3,4,5};
		Arrays.fill(arr5,10);
		System.out.println(Arrays.toString((arr5)));
		
		
		//
		
		
	}
}
