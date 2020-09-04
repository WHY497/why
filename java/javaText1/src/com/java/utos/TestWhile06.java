package com.java.utos;

public class TestWhile06 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int i = 1;
		@SuppressWarnings("unused")
		int result =1;
		while(i<=13) {
			result *= i;
			i=i+2;
		}
		System.out.println(result);
	}
}
