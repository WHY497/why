package com.java.utos;

import java.util.Scanner;

public class TestIf04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		��Ա����x         �ۿ�
		x>=8000            6��
		4000<=x<8000       7��
		2000<=x<4000       8�� 
		x<2000             9��
		  
		



		 */
		
		//1.��������
		@SuppressWarnings("unused")
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ա����:");
		//���жϼ����Ƿ�int����
		if(sc.hasNextInt()==true) {
			//
			int score = sc.nextInt();
			//�ж��Ƿ�Ϊ����
			if(score>=0) {
				if(score>=8000) {
					System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.6");
				}else if(score>=4000) {
					System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.7");
				}else if(score>=2000) {
					System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.8");
				}else  {
					System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.9");
				}
				
			}else {
				System.out.println("������Ļ��ֲ���������");
			}
			
		}else {
			System.out.println("������Ļ��ֲ���������");
		}
		
		
		
		//2.���ݻ����ж��ۿ�
		
		
		
		 
		 
		 
	}
}
