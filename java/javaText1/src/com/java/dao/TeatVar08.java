package com.java.dao;

public class TeatVar08 {
	public static void main(String[] args) {
	char ch1 = 'A';	
	System.out.println(ch1);//A
	System.out.println(ch1+90);//155
	System.out.println(155-ch1);//90
	//char�������ǿ��������泣����������������ӣ�
	//char �������ǿ��������Ӿ�������������泣�������ǵײ��ڽ��м����ʱ��ʵ���ϰ���һ��������м���ġ�
	//��������ASCII
	//֮ǰ˵char�����ǰ���Unicode�����д洢�ġ�
	
	char ch2 = '��';
	System.out.println(ch2);//��
	System.out.println(ch2+90);//20103
	System.out.println(20103-ch2);//
	
	int num1 = (int)ch2;
	System.out.println(num1);
	char ch6 = '2' + 2; // ASCII��'2'--> 50 50+2=52  ASCII 52-->'4'
	System.out.println(ch6);
	}
}
