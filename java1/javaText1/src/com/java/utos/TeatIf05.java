package com.java.utos;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TeatIf05 {
	public static void main(String [] args) {
		//1.¼��С���ѵ�����
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("��¼��С���ѵ�����:");
		int age = sc.nextInt();
		
		
		//2.���������жϣ�
		if(age>=7) {
			System.out.println("yes");
			
		}else if(age>=5) {
			System.out.println("��¼��С���ѵ��Ա��� ,Ů");
			String str = sc.next();
			char sex = str.charAt(0);
			
			/*
			 System.out.println("��¼��С���ѵ��Ա���:1 ,Ů:0");
			 int sex  = sc.nextInt();
			 if(sex==1) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			 
			 */
			 
			
			if(sex=='��') {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
		}else {
			System.out.println("no");
		}
			
	}
}
