package com.java.utos;

public class TestFor18 {
	public static void main(String[] args) {
		//先打印出一个正方形，然后某些位置上打印*，某些位置打印空格
		//******
		int size = 5;
		int startNum =size/2+1;//起始列号
		int endNum =size/2+1;//结束列号
		//引入一个布尔类型的变量 --》理解开关
		boolean flag = true;
		for(int j=1;j<=size;j++) {
			
			for(int i=1;i<=size;i++) {
				if(i>=startNum && i<=endNum) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//换行
			System.out.println();
			
			if(endNum==size) {
				flag=false;
				
			}
			
			if(flag) {
				startNum--;
				endNum++;
			}else {
				startNum++;
				endNum--;
			}
				
		}
	}
}
