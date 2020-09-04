package com.java.pojo;
//ÔËËã·û ¼ÓºÅ
public class TestOpe03 {
	public static void main(String[] args) {
		System.out.println(+5);//5
		System.out.println(5+6);//11
		System.out.println(5+'6');// 5 + ASCIIÂë 54 -->59
		
		int num = 56;
		System.out.println("num="+num);//56
		System.out.println(5+6+"7");//11+"7"-->117
		System.out.println(5+'6'+"7");//5 + 54 +"7" -->59+"7"-->597
		System.out.println("5"+6+"7");//"56"+"7"-->567
		System.out.println("5"+'6'+"7");//"56"+"7"-->567
		System.out.println("5"+'6'+'7');//"56"+'7' -->567
		
		
		
		
	}
}
