package com.java.arry;

import java.util.Arrays;
import java.util.Scanner;

public class TestArry12 {
	public static void main(String[] args) {
		//���ܣ�����һ�����飬ɾ���±�Ϊ2��Ԫ��
		
		//1.����һ������
		int [] arr = {12,34,56,7,8,9,13,999};
		
		
		//
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		
		//������ӵ���
		System.out.println("������һ��ɾ������λ�õڼ�����");
		int num1 = sc.nextInt();
		
		//2.���ɾ��ǰ������
		System.out.println("ɾ��Ԫ��ǰ������"+Arrays.toString(arr));
		
		//��
		
		
		//3.
		int index =num1;
		for(int i=index-1;i<=arr.length-2;i++) {
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1] =0;
		
		//4.���ɾ���������
		System.out.println("ɾ��Ԫ�غ������"+Arrays.toString(arr));
	} 
}
