package com.java.arry;

import java.util.Arrays;
import java.util.Scanner;

public class TestArry11 {
	public static void main(String[] args) {
		//���ܣ�����һ�����飬ɾ��ָ����Ԫ��
		
		//1.����һ������
		int [] arr = {12,34,56,7,8,9,13,999};
		
	
		//2.���ɾ��ǰ������
		System.out.println("ɾ��Ԫ��ǰ������"+Arrays.toString(arr));
		
		//
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//������ӵ���
		System.out.println("������һ������");
		int num1 = sc.nextInt();
		
		
		//��
		int index =-1;
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]==num1) {
	    		index=i;
	    		break;
	    	}
	    }	
		
		//3.
		if(index!=-1) {
			for(int i=index;i<=arr.length-2;i++) {
				arr[i]=arr[i+1];
				
			}
			arr[arr.length-1]=0;
			System.out.println("ɾ��Ԫ�غ������"+Arrays.toString(arr));
		}else {
			System.out.println("û��ɾ�������Ԫ��");
		}
		
		
		//4.���ɾ���������
		
	} 
}
