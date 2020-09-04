package com.java.pojo;

public class TestOpe10 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int i = 8;
		System.out.println((5>7) && (i++==2));
		System.out.println(i);
		
		
		@SuppressWarnings("unused")
		int a = 8;
		System.out.println((5>7) & (a++==2)); //a=2 a=a+1
		//                   false    a=2 a=a+1  
		System.out.println(a);
		
		@SuppressWarnings("unused")
		int m = 8;
		System.out.println((5<7) && (m++==2));
		//                   true    m=2 ,m=m+1
		System.out.println(m);
		
		@SuppressWarnings("unused")
		int b = 2;
		System.out.println((5<7) & (b++==2));
		//                  true     b=2,b=b+1
		System.out.println(b);
		
		@SuppressWarnings("unused")
		int c = 2;
		System.out.println((5<7) & (++c==2));
		//                  false    c=3,c=2
		
		System.out.println(c);
	}
}
