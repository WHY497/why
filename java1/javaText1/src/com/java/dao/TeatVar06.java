package com.java.dao;

public class TeatVar06 {
	public static void main (String[] args) {
		//�������͵ĳ��������֣�
		//ʮ����
		double num1 = 3.14;
		System.out.println(num1);
		//��ѧ������
		double num2 = 314E-2;
		System.out.println(num2);
		
		//�������͵ı�����
		//ע��:��������Ĭ��ʮdouble���͵ģ���Ҫ�ǽ�һ��double���͵�������float ���ͣ�����������F��f 
		float f1 = 3.14234567898623F;
		System.out.println(f1);
		
		//double ���ͺ�����Լ� D��d ������һ�����Ƕ�����
		double f2 = 3.14159261454515454545;
		System.out.println(f2);
		//ע�⣺��ò�Ҫ���и������͵ıȽ�
		
		float f3 = 0.3F;
		double d2 = 0.3;
		System.out.println(f3 == d2);
	}
}
