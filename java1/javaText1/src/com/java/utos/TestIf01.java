package com.java.utos;

import org.omg.CORBA.INTF_REPOS;

//if����֧
public class TestIf01 {
	public static void main(String[] args) {
		//ʵ��һ�����ܣ����������������1-6��������������ͼ��㣬���ݺ͵Ĵ�С�����䲻ͬ�Ľ�Ʒ
		//1.����������
		@SuppressWarnings("unused")
		int num1 = 6;
		@SuppressWarnings("unused")
		int num2 = 6;
		@SuppressWarnings("unused")
		int num3 = 6;
		
		
		
		
		//2.���
		@SuppressWarnings("unused")
		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;
		System.out.println("��Ϊ��"+sum);
		
		
		
		
		//3.���ݺ����жϽ�Ʒ
		if(sum>=14) {
			System.out.println("һ�Ƚ�");
			
		}
		if(sum>=10 && sum<14 ) {
			System.out.println("���Ƚ�");
			
		}
		if(sum>=6 && sum<10) {
			System.out.println("���Ƚ�");
			
		}
		if(sum<6) {
			System.out.println("�ĵȽ�");
			
		}
		/*
		if-����֧
		(1)�ṹ��
		if(�������ʽ��������ʽ�Ľ���ǲ���ֵ��Ҫô��false,Ҫô��true)
		
		(2)PS:����Ĵ�����,�����ĸ�����֧ƴ�ճ��ĸ�ѡ��ÿ��ѡ���Ƕ����ģ������ж�ִ�еġ�
		
		
	    (3)if����ģ����е�������Ҫô�����Լ����������ơ�
	    
	    (4){}����ʡ�Բ�д������һ��ʡ�ԣ����if�ͣ�
		 */
		
		
		
		
		
	}
}
