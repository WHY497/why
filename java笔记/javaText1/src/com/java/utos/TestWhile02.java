package com.java.utos;

public class TestWhile02 {
	public static void main(String[] args) {
		//1+2+3+4+5+6+....100;
		//1.
		@SuppressWarnings("unused")
		int i = 1;
		@SuppressWarnings("unused")
		int sum =0;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
