package com.java.arry;

import java.util.Scanner;

public class TestArry08 {
	public static void main(String[] args) {
		int[] arrs = new int[]{12,34,56,7,3,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int num1 = sc.nextInt();
		
		int index =getIndex(arrs, num1);
		
		
		if(index!=-1) {
			System.out.println("��Ӧ������:" + index);
		}else {
			System.out.println("û�������" );
			
		}
	
	
	}
	/*
	����һ����������ѯ������ָ����Ԫ�ض�Ӧ������
	��ȷ�����أ��Ǹ�����
	����ֵ������
	
	
	
	 */

	public static int getIndex(int []arr,int ele) {
		int index = -1;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==ele) {
				index = i;
				break;
			}
		}
		return index;
	}
}
