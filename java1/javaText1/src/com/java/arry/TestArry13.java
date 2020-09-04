package com.java.arry;

public class TestArry13 {
	/*
	1.可变参数：作用提供了一个方法，参数的个数是可变得
	int ...num
	double ...num
	boolean...num
	作用：解决了部分方法的重载问题
	
	
	
	
	2.可变参数在JDk1.5之后加入了特性
	
	3.方法内部对可变参数的处理跟数组是一样的：
	
	4.可变参数和其它数据一起作为参数的时候，可变参数一定要放在最后
	
	5.建议不是用可变参数
	 */
	
	
	
		public static void main(String[] args) {
			//method(10);
			//method();
			//method(20,30,40);
			method(30,40,50,60);
			//method01(new int[] {11,22,33,44});
		}
		public static void method(int num2,int... num) {   //添加的其它参数int num2，可变参数int num
			System.out.println("-----1");
			for(int i : num) {
				System.out.print(i+"\t"); 
			}
			System.out.println(); 
		}

}
