package com.java.utos;

import java.util.Random;

//���֧
public class TeastIf02 {
	public static void main(String[] args) {
		//ʵ��һ�����ܣ����������������1-6��������������ͼ��㣬���ݺ͵Ĵ�С�����䲻ͬ�Ľ�Ʒ
		
		
		//1.����������
				@SuppressWarnings("unused")
				int num1 = (int) (Math.random()*6)+1;;
				@SuppressWarnings("unused")
				int num2 = (int) (Math.random()*6)+1;;
				@SuppressWarnings("unused")
				int num3 = (int) (Math.random()*6)+1;;
				
				System.out.println("�����num1:"+num1);
				System.out.println("�����num2:"+num2);
				System.out.println("�����num3:"+num3);
				
				
				//2.���
				@SuppressWarnings("unused")
				int sum = 0;
				sum += num1;
				sum += num2;
				sum += num3;
				System.out.println("��Ϊ��"+sum);
				
				
				
				
				//3.���ݺ����жϽ�Ʒ
				if(sum>=14) {
					System.out.println("һ�Ƚ�");
				}else if(sum>=10 ) {
					System.out.println("���Ƚ�");
				}else if(sum>=6 ) {
					System.out.println("���Ƚ�");
				}else {
					System.out.println("�ĵȽ�");
				}
				/*
				(3)���֧���ô�ֻҪ����һ������֧�Ժ󣬺���ķ�֧�Ͳ���Ҫ�ж��ˣ������Ч�ʡ� 
				 */
	}
}
