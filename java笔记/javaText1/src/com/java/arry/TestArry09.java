package com.java.arry;

import java.util.Scanner;

public class TestArry09 {
	public static void main(String[] args) {
		//���ܣ�����һ�����飺
		int [] arr= {12,34,56,7,3,10};
		
		//
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//������ӵĵڼ���λ��
		System.out.println("��������ӵ��ڼ���λ�ã�");
		int num2 = sc.nextInt();
		
		//������ӵ���
		System.out.println("������һ����������");
		int num1 = sc.nextInt();
		
		//2.�������Ԫ��ǰ������
		System.out.print("����Ԫ��ǰ�����飺");
		
		for(int i=0; i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}else {
				System.out.print(arr[i]);
			}
		}
		//3.����Ԫ��
		int index =num2-1;
		for(int i=arr.length-1;i>=index+1;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = num1;
		
		//4.�������Ԫ�غ������
		System.out.print("\n����Ԫ�غ�����飺");
		
		for(int i=0; i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}else {
				System.out.print(arr[i]);
			}
		}
	}
}
