package com.java.arry;
//数组的遍历
import java.util.Scanner;

public class TestArry03 {
	public static void main(String[] args) {
		
		//以int类型数据为案列：
		//1.声明
		//int arr[];//定义一个int类型的数组，名字叫arr
		int [] scores = new int [10];
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			System.out.print("请录入第"+ i + "个学生的成绩:");
			int score=sc.nextInt();
			scores[i-1]=score;
			sum+=score;
			
		}
			
		//方式1
		for(int i=0;i<=9;i++) {
			System.out.println("第"+(i+1)+"个学生的成绩"+scores[i]);
		}
		
		System.out.println("所有学生的成绩之和：" +sum);	
		System.out.println("所有学生的成绩平均数：" +sum/10);
		
		//方式2：增强for循环
		//对scores数组进行遍历，遍历出来每个元素都用int类型名的num接收：
		/*
		增强for循环：
		优点：代码简单
		缺点：单纯的增强for循环不能涉及跟索引相关的操作
		*/
		
		int count =0;
		for(int num:scores) {
			count++;
			//每次都将num在控制台输出
			System.out.println("第"+ count +"个学生的成绩为："+num);
		}
		
		
		//方式3，利用普通for循环：逆向遍历
		for(int i=9;i>=0;i--) {
			System.out.println("第"+(i+1)+"个学生的成绩"+scores[i]);
		}
		/*
		int arr2[];//如果数组只声明，没有后续操作，那么这个数组相当于没有定义
		int [] arr3 =null;//空 辨别：数组赋值为null和什么都没有赋值，不一样的效果
		*/
		
		//2.创建
		//arr = new int[4];//给出数组开辟了一个长度为4的空间
		//编译期声明和创建会被合为一句话：int []arr = int[4]
		//3.赋值
		/*
		arr[0]=12;
		arr[1]=56;
		arr[2]=98;
		arr[3]=47;
		//arr[4]=47;超出越界
		*/
		
		//4.使用
		/*
		System.out.println(arr[2]);
		System.out.println(arr[0] + 100);
		
		//通过数组一个属性来获取
		System.out.println("数组的长度："+ arr.length);
		*/
		
		
		
		
		
	}
	
}
