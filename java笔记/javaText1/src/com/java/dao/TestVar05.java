package com.java.dao;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

@SuppressWarnings("unused")
public class TestVar05 {
	public static void main(String[] args) {
		//
		//�����������͵ı���
		int num1 = 12;//Ĭ��ʮʮ����
		System.out.println(num1);
		int num2 = 012;//ǰ�����0�����ֵ���ǰ˽���
		System.out.println(num2);
		int num3 = 0x12;//ǰ�����0x����0X,���ֵʮ������
		System.out.println(num3);
		int num4 = 0b10;//ǰ����0b,���ֵ���Ƕ�����
		System.out.println(num4);
		
		byte b =12;
		System.out.println(b);
		//ע�⣺����Χ�ĸ�ֵ�ᱨ��
		short s =30000;
		System.out.println(s);	
		
		int i = 20000;
		System.out.println(i);
		
		long num5 = 12345678910L;//�����ֵ�ĩβ��L��ʵ�� long ���� ��ֵ
		System.out.println(num5);
		//ע�⣺ֻ�����������  int ���͵ķ�Χ�˺������Ҫ����L,��������Ҫ��LҲ���Ը�ֵ��long
		
		
	}
}
