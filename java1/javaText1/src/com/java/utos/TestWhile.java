package com.java.utos;

import java.util.Scanner;

public class TestWhile {
	public static void main(String[] args) {
	//1.���ܣ�1+2+3+4+5+........
		@SuppressWarnings("unused")
		int num =1;
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("��¼���һ���ӵ�������:");
		int nmu1 = sc.nextInt();
		
	//2.ʵ��һ����ͱ����������������
		@SuppressWarnings("unused")
		int sum = 0;
		
		while(num<=nmu1) {
			sum+=num;
			num++;
		}
		//num:1 sum:0;
		
		//׼����ʼִ�е�һ��ѭ�����ж�num<=5�Ƿ����� --> true -->{} �д���ִ�У�sum:1,num:2,��һ��ѭ��������
		//׼����ʼִ�еڶ���ѭ�����ж�num<=5�Ƿ����� --> true -->{} �д���ִ�У�sum:3,num:3,�ڶ���ѭ��������
		//׼����ʼִ�е�����ѭ�����ж�num<=5�Ƿ����� --> true -->{} �д���ִ�У�sum:6,num:4,������ѭ��������
		//׼����ʼִ�е��Ĵ�ѭ�����ж�num<=5�Ƿ����� --> true -->{} �д���ִ�У�sum:10,num:5,���Ĵ�ѭ��������
		//׼����ʼִ�е����ѭ�����ж�num<=5�Ƿ����� --> true -->{} �д���ִ�У�sum:15,num:6,�����ѭ��������
		//׼����ʼִ�е�����ѭ�����ж�num<=5�Ƿ����� --> false-->{} �д��벻ִ��:
		System.out.println("��Ϊ��"+sum+"\n"+num);
	}
}
