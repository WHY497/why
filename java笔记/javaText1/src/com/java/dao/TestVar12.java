package com.java.dao;

import java.util.Scanner;

public class TestVar12 {
	public static void main (String[] args) {
		//����¼����� ���� ���� �Ա�
		//����¼�����䣺������int�������ݣ�
		System.out.println("����¼�����䣺");
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		
		//����¼����ߣ�������double�������ݣ�
		System.out.println("��¼����ߣ�");
		double height = sc.nextDouble();
		
		
		//����¼��������������String �������� �� --�ַ���
		System.out.println("��¼��������");
		String name = sc.next();
		
		
		
		//����¼���Ա𣺣�����char���ͣ�
		System.out.println("�Ա�");
		String sexStr = sc.next();
		char sex = sexStr.charAt(0);
		//�������仰���Ժ�Ϊһ�仰 ��ʾ��char sex = se.next().charAt(0);
		
		System.out.println("��ѧ������Ϣ��" + " ����:" + name + ",�Ա�:"+ sex + ",���:" + height + ",����:" + age);
		
		
		
		
		
	}
}
