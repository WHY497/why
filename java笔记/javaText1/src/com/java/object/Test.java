package com.java.object;

public class Test {
	public static void main(String[] args) {
		long num1 = Double.doubleToLongBits(1.9);
		System.out.println(num1);//4611235658464650854
		long num2 = Double.doubleToLongBits(1.9);
		System.out.println(num2);//4611235658464650854
	}
}
