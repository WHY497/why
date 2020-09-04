package com.java.pojo;

public class TestOpe07 {
	public static void main(String[] args) {
		//实现功能：给出三个数，求和：
		//1.给出三个数：
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		
		
		//2.求和：
		//int sum = num1 + num2 + num3; 
		
		//定义一个变量，用来接受和：
		
		int sum = 0;
		
		sum = sum + num1;// sum+=num1  
		sum = sum + num2;
		sum = sum + num3;
		
		//3.将和输出：
		System.out.println("和：" + sum);
		
		
		// a+=b 和 a=a+b
		//1.a+=b可读性稍差，编译效率高,底层自动进行类型转化
		//2.a=a+b可读性好，编译效率低，手动进行类型转换
		
		
		
		/*
		(1)请问a+=b 相当于 a=a+b ,那么也相当于a=b+a 吗
		
		对于基本数据来说：没区别
		a:10  b:40  
		a=a+b           a=b+a
		 
		 
		 对于String类型不一样了：
		 a:"u"   b:"x"
		  
		 a=a+b          a=b+a
		 
		 a="ux"           a="xu"
		 
		 
		 
		 
		
		 
		 (2)下面代码一样吗
		  byte a =10 ;
		  int b = 20;
		  
		  a+=b;
		  a=a+b;//错误   改正：a =(byte) (a+b)
		 */
		
	} 
}
