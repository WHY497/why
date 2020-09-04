package com.java.arry;

import java.util.Arrays;

public class TestArry14 {
	//�ġ�arry�������ʹ��
	public static void main(String[] args) {
		//����һ������
		@SuppressWarnings("unused")
		int [] arr = {1,3,7,2,4,8};
		//toString:����������鿴�ģ����ص���һ���ַ���������ַ����ȽϺÿ�
		System.out.println(Arrays.toString((arr)));
		
		
		//binarySearch:���ַ����ң��ҳ�ָ�������ָ��Ԫ�ض�Ӧ������
		//�ⷽ����ʹ�ã��������������Ч��������Ч�����뽫������������
		
		Arrays.sort(arr);//sort:����
		System.out.println(Arrays.toString((arr)));
		System.out.println(Arrays.binarySearch(arr,4));
		
		int [] arr2 = {1, 2, 3, 4, 7, 8};
		//copyOf:�������ĸ���
		int [] newArr = Arrays.copyOf(arr2,4);
		
		System.out.println(Arrays.toString((newArr)));
		
		
		//copyOfRange:����ĸ���
		
		int [] newArr2 = Arrays.copyOfRange(arr2,1,4);//[1,4) ---> 1,2,3λ��
		System.out.println(Arrays.toString((newArr2)));
		
		
		//equals:�Ƚ����������ֵ�Ƿ�һ����
		int [] arr3 = {1,3,7,2,4,8};
		int [] arr4 = {1,3,7,2,4,8};
		System.out.println(Arrays.equals(arr3, arr4));//true
		System.out.println(arr3==arr4);//false,�Ƚϵ��������ֵ�Ƿ���ȣ��Ƚϵ��ǵ�ֵַ��
		
		
		
		//fill:��������
		int [] arr5 = {1,2,3,4,5};
		Arrays.fill(arr5,10);
		System.out.println(Arrays.toString((arr5)));
		
		
		//
		
		
	}
}
