package com.java.utos;

public class TestFor08 {
	private static char[] i;
	public static void main(String[] args){
	//return:遇到return结束当前正在执行的方法
	/*
		for(int i=1;i<=100;i++) {
			while(i==36) {
				return;
			}
			System.out.println(i);
		}
		System.out.println("---");
	}
	*/
	
	
	for(int i=1;i<=100;i++) {
		while(i==36) {
			break;
		}
		System.out.println(i);
	}
	System.out.println("---");
}

}
