package com.java.arry;

import java.util.Scanner;

public class TestArry07 {
	public static void main(String [] args) {
		//��ѯָ��Ԫ�ص�λ�á�--�� �ҳ�Ԫ�ض�Ӧ������
		//����һ������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int num1 = sc.nextInt();
		int[] arr = new int[]{12,34,56,7,3,10};
		
		
		//���ܣ���ѯԪ��56��Ӧ��������
		int index = -1;
		
		for(int i=0;i<arr.length;i++) {
            if( arr[i] == num1 ) {
				index = i;//ֻҪ�ҵ�Ԫ�أ���ôindex�ͱ��Ϊi
				break;
			}
		}
		
		if(index!=-1) {
			System.out.println("��Ӧ������:" + index);
		}else {
			System.out.println("û�������" );
			
		}
	}
	
	/*
	����һ����������ѯ������ָ����Ԫ�ض�Ӧ������
	
	
	
	
	 */
	
	
}
