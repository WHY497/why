package com.java.utos;

public class TestFor07 {
	public static void main(String[] args) {
		outer:
		for(int i=1;i<100;i++) {
			while(i==36) {
				
				continue outer;//��������for��
			}
			System.out.println(i);//1-100 û��36����ѭ��
		}
	}
}
