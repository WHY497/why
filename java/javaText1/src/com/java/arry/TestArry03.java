package com.java.arry;
//����ı���
import java.util.Scanner;

public class TestArry03 {
	public static void main(String[] args) {
		
		//��int��������Ϊ���У�
		//1.����
		//int arr[];//����һ��int���͵����飬���ֽ�arr
		int [] scores = new int [10];
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			System.out.print("��¼���"+ i + "��ѧ���ĳɼ�:");
			int score=sc.nextInt();
			scores[i-1]=score;
			sum+=score;
			
		}
			
		//��ʽ1
		for(int i=0;i<=9;i++) {
			System.out.println("��"+(i+1)+"��ѧ���ĳɼ�"+scores[i]);
		}
		
		System.out.println("����ѧ���ĳɼ�֮�ͣ�" +sum);	
		System.out.println("����ѧ���ĳɼ�ƽ������" +sum/10);
		
		//��ʽ2����ǿforѭ��
		//��scores������б�������������ÿ��Ԫ�ض���int��������num���գ�
		/*
		��ǿforѭ����
		�ŵ㣺�����
		ȱ�㣺��������ǿforѭ�������漰��������صĲ���
		*/
		
		int count =0;
		for(int num:scores) {
			count++;
			//ÿ�ζ���num�ڿ���̨���
			System.out.println("��"+ count +"��ѧ���ĳɼ�Ϊ��"+num);
		}
		
		
		//��ʽ3��������ͨforѭ�����������
		for(int i=9;i>=0;i--) {
			System.out.println("��"+(i+1)+"��ѧ���ĳɼ�"+scores[i]);
		}
		/*
		int arr2[];//�������ֻ������û�к�����������ô��������൱��û�ж���
		int [] arr3 =null;//�� ������鸳ֵΪnull��ʲô��û�и�ֵ����һ����Ч��
		*/
		
		//2.����
		//arr = new int[4];//�������鿪����һ������Ϊ4�Ŀռ�
		//�����������ʹ����ᱻ��Ϊһ�仰��int []arr = int[4]
		//3.��ֵ
		/*
		arr[0]=12;
		arr[1]=56;
		arr[2]=98;
		arr[3]=47;
		//arr[4]=47;����Խ��
		*/
		
		//4.ʹ��
		/*
		System.out.println(arr[2]);
		System.out.println(arr[0] + 100);
		
		//ͨ������һ����������ȡ
		System.out.println("����ĳ��ȣ�"+ arr.length);
		*/
		
		
		
		
		
	}
	
}
