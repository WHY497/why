package com.java.pojo;

public class TestOpe05 {
	public static void main(String[] args) {
		int a = 5 ;
		//运算符的优先级：
		//++ > +
		System.out.println(a++ + a++);// 
		//                  5  +  6   a=7    //11
		System.out.println(a++ + ++a);//
		//					7  +   9  a=9    //16
		System.out.println(++a + a++);//
		//                  10 + 10  a=11   //20           
		System.out.println(++a + ++a);//
		//                  12 +  13  a=13   //25        
	}
	
	
}
