package com.java.dao;
//�������͵�ת��
public class TestVar10 {
	public static void main(String [] args) {
		double d = 6; // int --> double  Сת��   �Զ�ת�� 
		System.out.println(d);
		int i = (int) 6.5;   // double --> int ��תС ǿ������ת��
		System.out.println(i);
		
		//��ͬһ�����ʽ�У��ж���������͵�ʱ��Ӧ����δ���
		//�����������Ͳ��������ʱ���������ͣ��������ͣ��ַ����Ͷ����Բ������㣬Ψ���������͵Ĳ����Բ������㡣
		//double d2 = 12 + 1294L + 8.5F + 3.81 + 'a' + true;
		double d2 = 12 + 1294L + 8.5F + 3.81 + 'a' ;
		//          12.0 + 1294.0 + 8.5 + 3.81 + 97.0
		System.out.println(d2);
		/*
		 ���ͼ���(�ӵ͵���)
		 byte ,short, char --> int -->long --> float --> double
		 ��һ�����ʽ���ж����������͵�ʱ��Ҫ�ҳ���ǰ���ʽ�м�����ߵ��Ǹ�����
		 �������Ͷ�ת��Ϊ��ǰ���ʽ�м�����ߵ�����
		 
		 */
		int i2 = (int) (12 + 1294L + 8.5F + 3.81 + 'a');
		//
		//          12.0 + 1294.0 + 8.5 + 3.81 + 97.0
		System.out.println(i2);
		/*
		 �ڽ��������ʱ��
		 ��=��  ��ֱ�Ӹ�ֵ
		 ��<��  ��ǿ��ת��
		 ��>��  : ֱ��ת��
		 */
		
		
		//�������������byte short char  ������˵��ֻҪ�����ǵı�����Χ֮�ھͲ���Ҫǿת
		//ֱ�Ӹ�ֵ
		byte b = 12;
		System.out.println(b);
		
		byte b2 = (byte) 270;
		System.out.println(b2);
		
		
		
		
	}
}
