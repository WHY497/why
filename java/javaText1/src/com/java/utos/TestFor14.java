package com.java.utos;

public class TestFor14 {
	public static void main(String[] args) {
		/*
		          ƽ���ı���
		     ******** 
		    ********
		   ********
		  ********
		*/
		
		for(int j=1;j<=4;j++) {//����*������
			
			//����ո�
			for(int i=1;i<=(9-j);i++) {//����ո�
				System.out.print(" ");
			}
			
			for(int i = 1;i<=9;i++) {//����*�ĸ���
				System.out.print("*");
			}
			System.out.println();
			
		}
	} 
}
