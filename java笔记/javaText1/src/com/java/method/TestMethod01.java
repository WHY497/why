package com.java.method;
/*
 1.�����ǣ����ض��Ĺ��ܽ�����ȡ���γ�һ������1Ƭ�Σ��������Ƭ�ξ���������˵�ķ���
 2.�����ͷ����ǲ��еģ��������Ƕ���ķ�������д��main������
 3.�����Ķ���--�� ��ʽ��
 ���η�  ��������ֵ���� ������(�β��б�){
 	������;
 4.��ߴ���ĸ�����
 }





*/

import java.util.Scanner;

//�����Ķ���
public class TestMethod01 {
	public static int add(int num1,int num2) {
		int sum=0;
		sum+=num1;
		sum+=num2;
		return sum;

	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//10+20\
		/*
		int num1=10;
		int num2=20;
		int sum = 0;
		
		sum+=num1;
		sum+=num2;
		System.out.println(sum);
		*/
		
		//�����ĵ���
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("num1:");
		int num1 = input.nextInt();
		
		System.out.println("num2:");
		int num2 = input.nextInt();
		
		int sum1 = add(num1, num2);
		System.out.println(sum1);
		
		
		
		
	}
}
