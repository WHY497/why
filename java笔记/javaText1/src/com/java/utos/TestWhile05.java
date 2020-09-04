package com.java.utos;

public class TestWhile05 {
	public static void main(String[] args) {
		//99+97+95+...+1
		int i=99;
		int sum =0;
		while(i>=1) {
			sum += i;
			i=i-2;
		}
		System.out.println(sum);
	}
}
