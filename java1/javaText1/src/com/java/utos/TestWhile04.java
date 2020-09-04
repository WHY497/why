package com.java.utos;

public class TestWhile04 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int i = 5;
		@SuppressWarnings("unused")
		int sum =0;
		while(i<=100) {
			sum += i;
			i=i+5;
		}
		System.out.println(sum);
	
	
	}
}
