package com.java.utos;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class TestFor10 {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		//��¼��һ��10���������������������666��ʱ���Ƴ���Ϸ
		//�ж�����¼�������ĸ��������
		//�ж�ϵͳ���˳�״̬�����������Ǳ����˳���
		
		
		//1.��¼��һ��10��������
		@SuppressWarnings("unused")
		Scanner sc = new Scanner(System.in);
		
		//����һ��������
		int count=0;
		//����һ���������ͱ���
		boolean flag = true;//
		for(int i = 1;i<=10;i++) {
			System.out.println("��¼���"+i+"����:");
			int num = sc.nextInt();
			if(num>0) {//¼�������ĸ�������
				count++;
			}
			
			if(num==666) {
				flag=false;
				break;
			}
			
		}
		System.out.println("��¼�������ĸ�����"+count);
		//
		
		if(flag==true) {
			System.out.println("�����˳�");
		}else {
			System.out.println("�����˳�");
		}
		
		
		
	}
}
