package com.java.pojo;
//逻辑运算符
public class TestOpe09 {
	@SuppressWarnings("unused")
	public static void main (String[] args) {
		//逻辑与 &:只要一个操作数为false 都是false
		System.out.println(true&true);//
		System.out.println(true&false);//
		System.out.println(false&false);//
		System.out.println(false&true);//
		
		
		//短路与&& :效率高一些，只要第一个表达式是false ;那么结果是false
		System.out.println(true&&true);//
		System.out.println(true&&false);//
		System.out.println(false&&false);//
		System.out.println(false&&true);//
		
		
		//逻辑或 | : 只要有一个操作时true ,那么结果一定是true
		System.out.println(true|true);//
		System.out.println(true|false);//
		System.out.println(false|false);//
		System.out.println(false|true);//
		
		//短路或 || :效率高一些，只要第一个表达式是true ;那么结果是true
		System.out.println(true||true);//
		System.out.println(true||false);//
		System.out.println(false||false);//
		System.out.println(false||true);//
		
		//逻辑非：结果相反
		System.out.println(!true);//
		System.out.println(!false);//
		
		//逻辑异或：^ :两个操作相同，结果为false ,不相同，结果为true
		System.out.println(true^true);//
		System.out.println(true^false);//
		System.out.println(false^false);//
		System.out.println(false^true);//
		
		
	}
}
