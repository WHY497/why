package com.java.utos;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TeatIf05 {
	public static void main(String [] args) {
		//1.录入小朋友的年龄
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入小朋友的年龄:");
		int age = sc.nextInt();
		
		
		//2.根据年龄判断：
		if(age>=7) {
			System.out.println("yes");
			
		}else if(age>=5) {
			System.out.println("请录入小朋友的性别：男 ,女");
			String str = sc.next();
			char sex = str.charAt(0);
			
			/*
			 System.out.println("请录入小朋友的性别：男:1 ,女:0");
			 int sex  = sc.nextInt();
			 if(sex==1) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			 
			 */
			 
			
			if(sex=='男') {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
		}else {
			System.out.println("no");
		}
			
	}
}
