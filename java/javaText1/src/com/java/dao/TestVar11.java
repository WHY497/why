package com.java.dao;
import java.util.Scanner;
//����һ���ط�ȥ¼������  import.java.util.Scanner
public class TestVar11 {
	public static void main (String [] args) {
		//ʵ�ֹ��ܣ�ʵ��Բ��������ܳ�
		//��ȡ������һ������
		//
		final double PI = 3.1415926;
		//����һ��ɨ����
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//��ɨ����ɨ��������¼��� int ���͵����ݣ�
		System.out.println("��¼��һ���뾶��");
		int r = sc.nextInt();
		//����һ���ط�ȥ¼������  import.java.util.Scanner
		//���ܳ���
		double c = 2 * PI * r;
		System.out.println("�ܳ�Ϊ��"+ c);
		
		//�����
		double s = PI * r * r;
		System.out.println("���Ϊ��"+s);
		
		
	}
}
