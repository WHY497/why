package com.java.utos;

import javax.print.attribute.standard.PrinterLocation;

public class TestSwitch {
	public static void main(String[] args) {
		//实现功能
		/*
		 根据学生的分数，判断学生的等级
		 >=90      -----A
		 >=80      -----B
		 >=70      -----C
		 >=60      -----D
		 <60       -----E
		 
		 */
		//1.给出学生的成绩
		int score = 197;
		
		switch(score/10) {
			case 10 : System.out.println("A级");
				break;
			case 9 : System.out.println("A级");
				break;
			case 8 : System.out.println("B级");
				break;
			case 7 : System.out.println("C级");
				break;
			case 6 : System.out.println("D级");
				break;
			case 5 : System.out.println("E级");
				break;
			case 4 : System.out.println("E级");
				break;
			case 3 : System.out.println("E级");
				break;
			case 2 : System.out.println("E级");
				break;
			case 1 : System.out.println("E级");
				break;
			case 0 : System.out.println("E级");
				break;
			 default:System.out.println("程序错误");
		}
		
		
		
		//2.根据成绩判断学生的等级
		
		
		
		
	}
}
