package com.java.utos;

public class TestFor07 {
	public static void main(String[] args) {
		outer:
		for(int i=1;i<100;i++) {
			while(i==36) {
				
				continue outer;//结束本次for。
			}
			System.out.println(i);//1-100 没有36和死循环
		}
	}
}
