package com.java.arry;

public class TestArry13 {
	/*
	1.�ɱ�����������ṩ��һ�������������ĸ����ǿɱ��
	int ...num
	double ...num
	boolean...num
	���ã�����˲��ַ�������������
	
	
	
	
	2.�ɱ������JDk1.5֮�����������
	
	3.�����ڲ��Կɱ�����Ĵ����������һ���ģ�
	
	4.�ɱ��������������һ����Ϊ������ʱ�򣬿ɱ����һ��Ҫ�������
	
	5.���鲻���ÿɱ����
	 */
	
	
	
		public static void main(String[] args) {
			//method(10);
			//method();
			//method(20,30,40);
			method(30,40,50,60);
			//method01(new int[] {11,22,33,44});
		}
		public static void method(int num2,int... num) {   //��ӵ���������int num2���ɱ����int num
			System.out.println("-----1");
			for(int i : num) {
				System.out.print(i+"\t"); 
			}
			System.out.println(); 
		}

}
