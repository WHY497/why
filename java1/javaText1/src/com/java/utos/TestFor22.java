package com.java.utos;

public class TestFor22 {
	public static void main(String[] args) {
		for(int a=1;a<=19;a++) {
			for(int b=1;b<=31;b++) {
				int c = 100 - a - b;
				if( ( (5*a) + (3*b) +(c/3)==100 )  && (c%3==0) ) {
						System.out.println("¹«¼¦£º"+a+"-----"+ "Ä¸¼¦£º"+b+"-----"+"Ð¡¼¦£º"+c);
				}
			}
		}
	}
}
