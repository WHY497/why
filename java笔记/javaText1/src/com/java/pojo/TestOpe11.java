package com.java.pojo;

import java.util.Scanner;

public class TestOpe11 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//ʵ�ֹ��ܣ��к�Ů��ѡ������ʲô��������һ�£��������ģ���������һ�£���Ů����
		
		//1.Ҫ���к�Ů��ѡ������ʲô��
		@SuppressWarnings("unused")
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ������ʲô��1.���  2.�տ�   3.������  4.����");
		@SuppressWarnings("unused")
		int boyChoise = sc.nextInt();
		System.out.println("��Ů��ѡ��");
		@SuppressWarnings("unused")
		int girlChoise = sc.nextInt();
		
		//2.�ж�
		System.out.println(boyChoise == girlChoise?"���к���":"��Ů����");
		
		
	}
}
