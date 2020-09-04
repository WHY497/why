package com.java.utos;

public class TestFor16 {
	public static void main(String[] args) {
		/*
		          菱形
		     *
		    ***
		   *****
		  *******
		   *****
		    ***
		     *
		*/
		
		for(int j=1;j<=4;j++) {//控制*的行数
			
			//加入空格
			for(int i=1;i<=(9-j);i++) {//加入空格
				System.out.print(" ");
			}
			
			for(int i = 1;i<=(2*j-1);i++) {//控制*的个数
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int j=1;j<=3;j++) {//控制*的行数
			
			//加入空格
			for(int i=1;i<=(j+5);i++) {//加入空格
				System.out.print(" ");
			}
			
			for(int i = 1;i<=(7-2*j);i++) {//控制*的个数
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	} 
}
