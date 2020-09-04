package com.java.utos;

public class TestFor13 {
	public static void main(String[] args) {
		//正方形
		
		for(int j=1;j<=4;j++) {//控制*的行数
			
			//加入空格
			for(int i=1;i<=5;i++) {
				System.out.print(" ");
			}
			
			for(int i = 1;i<=9;i++) {//控制*的个数
				System.out.print("*");
			}
			System.out.println();
			
		}
	} 
}
