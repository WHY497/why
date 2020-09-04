package com.java.arry;

public class TestArry02 {
	public static void main(String[] args) {
		//以int类型数据为案列：
		//1.声明
		int arr[];//定义一个int类型的数组，名字叫arr
		/*
		int arr2[];//如果数组只声明，没有后续操作，那么这个数组相当于没有定义
		int [] arr3 =null;//空 辨别：数组赋值为null和什么都没有赋值，不一样的效果
		*/
		//2.创建
		arr = new int[4];//给出数组开辟了一个长度为4的空间
		//编译期声明和创建会被合为一句话：int []arr = int[4]
		//3.赋值
		arr[0]=12;
		arr[1]=56;
		arr[2]=98;
		arr[3]=47;
		//arr[4]=47;超出越界
		
		//4.使用
		System.out.println(arr[2]);
		System.out.println(arr[0] + 100);
		
		//通过数组一个属性来获取
		System.out.println("数组的长度："+ arr.length);
		
	}
 }
