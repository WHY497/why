package com.java.method;

import javax.imageio.ImageTypeSpecifier;
import java.util.Scanner; 
public class TestMethod03 {
	/*
	@SuppressWarnings({ "unused", "resource" })
	
	public static void  main(String[] args) {
		//���ܣ���������һ�����������£��Ƿ�¶�
		//1.���һ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		
		int yourGuessNum = sc.nextInt();
		//2.��������һ����
		int myHeartNum = 5;
		//3.���������ȶԣ�
		
		System.out.println(yourGuessNum==myHeartNum? "�¶���":"�´���");
	}
	*/
	
	
	
	
	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����:");
		
		int yourGuessNum = sc.nextInt();
		//2.��������һ����
		
		
		//
		guessNum(yourGuessNum);
	
	
	}
	
	
	
	//�����Ķ��壺���ܣ�ʵ�ֲ�������
	public static void guessNum(int yourNum) {
		//��������һ����(1-6)
		int myHeartNum =(int)(Math.random()*6+1);
		//���������ȶԣ�
		
		System.out.println(yourNum==myHeartNum? "�¶���":"�´���");
		System.out.println("myHeartNum:"+myHeartNum);
	}
}
