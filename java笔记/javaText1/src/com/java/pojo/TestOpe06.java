package com.java.pojo;
//�������������ַ�����
public class TestOpe06 {
	public static void main(String[] args) {
		//�������������������������
		//1.������������
		int num1 = 10;
		int num2 = 20;
		
		//2.�������ǰ����������
		System.out.println("����ǰ��"+ num1 +"\t" + num2);
		
		
		//3.����
		/*
		 �������
		num1 = num2;
		num2 = num1;
				
		*/
		//����취
		//�����м����
		
		int t;
		t = num1;
		num1 = num2;
		num2 = t;
		
		/*
		 int t ;
		 t = num1;
		 num2 = num1;
		 num1 = t;
		 
		 */
		
		
		
		
		
		//4.����������������
		
		System.out.println("������"+ num1 +"\t" + num2);
		
		
		
	}
}
