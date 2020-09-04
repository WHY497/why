package com.java.arry;

import java.util.Arrays;

public class TestArry15 {
	
	//五、数组的复制
	public static void main(String[] args) {
		//给一个源数组：
		int [] srcArr = {11,22,33,44};
		//目标数组
		int [] destArr = new int [10];
		
		
		//
		System.arraycopy(srcArr, 1,destArr, 3, 3);
		//遍历数组看目标数组
		System.out.println(Arrays.toString(destArr));
	}
}
