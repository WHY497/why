package com.java.utos;

public class TestFor02 {
	public static void main(String[] args) {
		//功能：求1-100的和，当和第一次超过300的时候，停止程序
		
		int sum = 0;
		int i;
		
		/*
		for( i=1;i<=100;i++) {
			sum+=i;
			System.out.println("i:"+i);
			if(i==36) {
				break;
			}
			System.out.println("sum:"+sum);
		*/
		
		/*
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(sum>300) {
				break;
			}
			System.out.println("sum:"+sum);
		*/
		/*
		for(i =1;i<=100;i++) {
			System.out.println(i);
			while(i==36) {
				break;//--->break停止的是while循环,不是for循环。
				
			}
			
		}
		*/
		/*
		outer:
		for(i =1;i<=100;i++) {
			System.out.println(i);
			while(i==36) {
				break outer;//加标签outer:，结束for循环。
				//多层循环也可以使用标签
			}
		}
		
		*/
		/*方式1
		for(i =1;i<=100;i++) {
			
			 
			if(i%6==0) {	
				System.out.println(i);	
			}
		}
		*/
		
		for(i =1;i<=100;i++) {
			if(i%6!=0) {
				continue;//停止本次循环，继续下一次循环
			}
			System.out.println(i);	
		}
		
		
	} 
}
