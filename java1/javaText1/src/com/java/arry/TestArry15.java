package com.java.arry;

import java.util.Arrays;

public class TestArry15 {
	
	//�塢����ĸ���
	public static void main(String[] args) {
		//��һ��Դ���飺
		int [] srcArr = {11,22,33,44};
		//Ŀ������
		int [] destArr = new int [10];
		
		
		//
		System.arraycopy(srcArr, 1,destArr, 3, 3);
		//�������鿴Ŀ������
		System.out.println(Arrays.toString(destArr));
	}
}
