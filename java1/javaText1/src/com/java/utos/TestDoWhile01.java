package com.java.utos;

public class TestDoWhile01 {
	public static void main(String[] args) {
		//1+2+3+4+....100
		//do while
		int i =1;
		@SuppressWarnings("unused")
		int sum =0;
		do {
			sum+=i;
			i++;
			
		}while(i<=100);
		System.out.println(sum);
	}
}
