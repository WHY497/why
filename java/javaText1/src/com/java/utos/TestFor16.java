package com.java.utos;

public class TestFor16 {
	public static void main(String[] args) {
		/*
		          ����
		     *
		    ***
		   *****
		  *******
		   *****
		    ***
		     *
		*/
		
		for(int j=1;j<=4;j++) {//����*������
			
			//����ո�
			for(int i=1;i<=(9-j);i++) {//����ո�
				System.out.print(" ");
			}
			
			for(int i = 1;i<=(2*j-1);i++) {//����*�ĸ���
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int j=1;j<=3;j++) {//����*������
			
			//����ո�
			for(int i=1;i<=(j+5);i++) {//����ո�
				System.out.print(" ");
			}
			
			for(int i = 1;i<=(7-2*j);i++) {//����*�ĸ���
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	} 
}
