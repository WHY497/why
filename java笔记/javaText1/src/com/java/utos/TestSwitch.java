package com.java.utos;

import javax.print.attribute.standard.PrinterLocation;

public class TestSwitch {
	public static void main(String[] args) {
		//ʵ�ֹ���
		/*
		 ����ѧ���ķ������ж�ѧ���ĵȼ�
		 >=90      -----A
		 >=80      -----B
		 >=70      -----C
		 >=60      -----D
		 <60       -----E
		 
		 */
		//1.����ѧ���ĳɼ�
		int score = 197;
		
		switch(score/10) {
			case 10 : System.out.println("A��");
				break;
			case 9 : System.out.println("A��");
				break;
			case 8 : System.out.println("B��");
				break;
			case 7 : System.out.println("C��");
				break;
			case 6 : System.out.println("D��");
				break;
			case 5 : System.out.println("E��");
				break;
			case 4 : System.out.println("E��");
				break;
			case 3 : System.out.println("E��");
				break;
			case 2 : System.out.println("E��");
				break;
			case 1 : System.out.println("E��");
				break;
			case 0 : System.out.println("E��");
				break;
			 default:System.out.println("�������");
		}
		
		
		
		//2.���ݳɼ��ж�ѧ���ĵȼ�
		
		
		
		
	}
}
