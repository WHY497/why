package com.java.arry;

public class TestArry04 {
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		//ʵ��һ�����ܣ�����һ������int() arr={12,3,7,4,8,125,9,45};���������������
		//ԭ������ԭ��
		
		//1.����һ������
		@SuppressWarnings("unused")
		int [] arr ={12,3,7,4,8,125,9,45};
		
		
		
		//2.��������е����ֵ
		//����һ��������̨���ٶ���Ϊ��������
		int maxNum = arr[0];
		int minNum = arr[0];
		for(int i =0;i< arr.length;i++) {
			if(arr[i]>maxNum) {
				maxNum = arr[i];
			}else if(arr[i]<minNum){
				minNum = arr[i];
			}
				
		}
		System.out.println("��ǰ������������Ϊ��"+maxNum);
		System.out.println("��ǰ��������С����Ϊ��"+minNum);
				/*
		 ����ȡһ���������������е����ֵ
		 ���Ǹ������е����ֵ---����ȷ�����أ��Ǹ�����(�β�)---������ֵ�����ֵ
		 */
		
	}

}
