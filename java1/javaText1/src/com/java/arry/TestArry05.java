package com.java.arry;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestArry05 {
	
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		@SuppressWarnings("unused")
		int [] arr ={12,3,7,4,8,125,9,45};
		
		//���÷�����
		int num = getMaxNum(arr);
		System.out.println("��ǰ������������Ϊ��"+num);
		
		 
		
	
	}
	
	
	/*
		 ����ȡһ���������������е����ֵ
		 ���Ǹ������е����ֵ---����ȷ�����أ��Ǹ�����(�β�)---������ֵ�����ֵ
	 */
	
	public static int getMaxNum(int [] arr) {
			int maxNum = arr[0];
			int minNum = arr[0];
			for(int i =0;i< arr.length;i++) {
				if(arr[i]>maxNum) {
					maxNum = arr[i];
					
				}else if(arr[i]<minNum){
					minNum = arr[i];
					
				}
					
			}
			return maxNum;
			
			 
	}
	

}
