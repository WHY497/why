package com.java.arry;
import java.util.Scanner;
public class TestArry01 {
	public static void main(String[] args) {
		//ʵ�ֹ��ܣ�����¼���Ǹ�ѧ���ĳɼ�����ͣ���ƽ����
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.print("��¼���"+i +"��ѧ���ĳɼ���");
			@SuppressWarnings("unused")
			int score = sc.nextInt();
			sum +=score;
		}
		System.out.println("����ѧ���ĳɼ�֮�ͣ�" +sum);	
		System.out.println("����ѧ���ĳɼ�ƽ������" +sum/10);	
		
	}
}
