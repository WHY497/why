package com.java.pojo;

public class TestOpe07 {
	public static void main(String[] args) {
		//ʵ�ֹ��ܣ���������������ͣ�
		//1.������������
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		
		
		//2.��ͣ�
		//int sum = num1 + num2 + num3; 
		
		//����һ���������������ܺͣ�
		
		int sum = 0;
		
		sum = sum + num1;// sum+=num1  
		sum = sum + num2;
		sum = sum + num3;
		
		//3.���������
		System.out.println("�ͣ�" + sum);
		
		
		// a+=b �� a=a+b
		//1.a+=b�ɶ����Բ����Ч�ʸ�,�ײ��Զ���������ת��
		//2.a=a+b�ɶ��Ժã�����Ч�ʵͣ��ֶ���������ת��
		
		
		
		/*
		(1)����a+=b �൱�� a=a+b ,��ôҲ�൱��a=b+a ��
		
		���ڻ���������˵��û����
		a:10  b:40  
		a=a+b           a=b+a
		 
		 
		 ����String���Ͳ�һ���ˣ�
		 a:"u"   b:"x"
		  
		 a=a+b          a=b+a
		 
		 a="ux"           a="xu"
		 
		 
		 
		 
		
		 
		 (2)�������һ����
		  byte a =10 ;
		  int b = 20;
		  
		  a+=b;
		  a=a+b;//����   ������a =(byte) (a+b)
		 */
		
	} 
}
