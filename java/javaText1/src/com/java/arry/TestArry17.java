package com.java.arry;
//��ά����ĳ�ʼ��
public class TestArry17 {
	public static void main(String[] args) {
		int [][] arr=new int [3][2];//�������ڳ�ʼ����ʱ�� 3��2
		
		arr[1] =new int [] {1,2,3,4};
		
		for(int[] a:arr) {
			for(int num:a) {
				System.out.print(num+"\t");
			}
			System.out.println();
		}
	}
}
