package com.java.utos;

public class TestWhile03 {
	public static void main(String[] args) {
		// 2+4+6+8+10+......999+1000
		@SuppressWarnings("unused")
		int i = 2;
		@SuppressWarnings("unused")
		int sum = 0;
		while(i<=1000) {
			sum += i;
			i=i+2;
		}
		System.out.println(sum);
	}
}
