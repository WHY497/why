package com.java.arry;

public class TestArry02 {
	public static void main(String[] args) {
		//��int��������Ϊ���У�
		//1.����
		int arr[];//����һ��int���͵����飬���ֽ�arr
		/*
		int arr2[];//�������ֻ������û�к�����������ô��������൱��û�ж���
		int [] arr3 =null;//�� ������鸳ֵΪnull��ʲô��û�и�ֵ����һ����Ч��
		*/
		//2.����
		arr = new int[4];//�������鿪����һ������Ϊ4�Ŀռ�
		//�����������ʹ����ᱻ��Ϊһ�仰��int []arr = int[4]
		//3.��ֵ
		arr[0]=12;
		arr[1]=56;
		arr[2]=98;
		arr[3]=47;
		//arr[4]=47;����Խ��
		
		//4.ʹ��
		System.out.println(arr[2]);
		System.out.println(arr[0] + 100);
		
		//ͨ������һ����������ȡ
		System.out.println("����ĳ��ȣ�"+ arr.length);
		
	}
 }
