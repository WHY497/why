package com.java.arry;

import java.util.Arrays;
//��ά���鶨��ͱ���
public class TestArry16 {
	public static void main(String[] args) {
		//����һ������
		
		int [] [] arr= new  int [3] [];
		//�����϶�����һ��һά���飬����Ϊ3
		
		int [] a1 = {1,2,3};
		arr[0]=a1; 
		arr[1]=new int [] {4,5,6,7};
		arr[2]=new int [] {9,10};
		
		
		//��ȡ6���Ԫ��
		System.out.println(arr[1][2]);
		
		
	
		//�Զ�ά�������
		/*
		 * ��ʽ1�������ͨforѭ����+�ڲ���ͨforѭ��
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		*/
		
		//��ʽ2�������ͨforѭ��+�ڲ���ǿforѭ��
		/*
		for(int i=0;i<arr.length;i++) {
			for(int num:arr[i]) {
				System.out.print(num+"\t");
			}
			System.out.println();
		}
		*/
		/*
		//��ʽ3�������ǿforѭ��+�ڲ���ǿforѭ��
		for(int[] a:arr) {
			for(int num:a) {
				System.out.print(num+"\t");
			}
			System.out.println();
		}
		*/
		
		//��ʽ4�������ǿforѭ��+�ڲ���ͨ����ѭ��
		for(int[] a:arr) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+"\t");
			}
			System.out.println();
		}
		
	}
	
}
