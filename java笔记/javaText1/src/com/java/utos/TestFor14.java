package com.java.utos;

public class TestFor14 {
	public static void main(String[] args) {
		/*
		          平行四边形
		     ******** 
		    ********
		   ********
		  ********
		*/
		
		for(int j=1;j<=4;j++) {//控制*的行数
			
			//加入空格
			for(int i=1;i<=(9-j);i++) {//加入空格
				System.out.print(" ");
			}
			
			for(int i = 1;i<=9;i++) {//控制*的个数
				System.out.print("*");
			}
			System.out.println();
			
		}
	} 
}
