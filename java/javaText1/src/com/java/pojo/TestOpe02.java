package com.java.pojo;

import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

@SuppressWarnings("unused")
public class TestOpe02 {
	public static void main (String [] args) {
		//ʵ�ֹ��ܣ��������һ����λ�������ÿλ�ϵ����ֲ����
		//1.�������һ����λ��
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("��¼��һ����λ��:");
		int num = input.nextInt();
		
		//2.���ÿλ�ϵ�����
		//��λ��
		int num1 = num % 10;
		
		//ʮλ��
		int num2 =num / 10 %10;
		
		
		//��λ��
		int num3 = num /100 %10;
		
		//ǧλ��
		 int num4 = num /1000;
		
		
		//3.���ÿλ�ϵ����֣�
		System.out.println("��λ�ϵ�����"+num1);
		System.out.println("ʮλ�ϵ�����"+num2);
		System.out.println("��λ�ϵ�����"+num3);
		System.out.println("ǧλ�ϵ�����"+num4);
		
		
		
	}
}
