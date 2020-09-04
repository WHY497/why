package com.java.utos;

import org.omg.CORBA.INTF_REPOS;

//if单分支
public class TestIf01 {
	public static void main(String[] args) {
		//实现一个功能：随机给出三个数（1-6），对三个数求和计算，根据和的大小来分配不同的奖品
		//1.给出三个数
		@SuppressWarnings("unused")
		int num1 = 6;
		@SuppressWarnings("unused")
		int num2 = 6;
		@SuppressWarnings("unused")
		int num3 = 6;
		
		
		
		
		//2.求和
		@SuppressWarnings("unused")
		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;
		System.out.println("和为："+sum);
		
		
		
		
		//3.根据和来判断奖品
		if(sum>=14) {
			System.out.println("一等奖");
			
		}
		if(sum>=10 && sum<14 ) {
			System.out.println("二等奖");
			
		}
		if(sum>=6 && sum<10) {
			System.out.println("三等奖");
			
		}
		if(sum<6) {
			System.out.println("四等奖");
			
		}
		/*
		if-单分支
		(1)结构：
		if(条件表达式，这个表达式的结果是布尔值，要么是false,要么是true)
		
		(2)PS:上面的代码中,我用四个单分支拼凑出四个选择，每个选择是独立的，依次判断执行的。
		
		
	    (3)if后面的（）中的条件，要么按照自己需求尽量完善。
	    
	    (4){}可以省略不写，但是一旦省略，这个if就，
		 */
		
		
		
		
		
	}
}
