package com.java.utos;

public class TestFor02 {
	public static void main(String[] args) {
		//���ܣ���1-100�ĺͣ����͵�һ�γ���300��ʱ��ֹͣ����
		
		int sum = 0;
		int i;
		
		/*
		for( i=1;i<=100;i++) {
			sum+=i;
			System.out.println("i:"+i);
			if(i==36) {
				break;
			}
			System.out.println("sum:"+sum);
		*/
		
		/*
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(sum>300) {
				break;
			}
			System.out.println("sum:"+sum);
		*/
		/*
		for(i =1;i<=100;i++) {
			System.out.println(i);
			while(i==36) {
				break;//--->breakֹͣ����whileѭ��,����forѭ����
				
			}
			
		}
		*/
		/*
		outer:
		for(i =1;i<=100;i++) {
			System.out.println(i);
			while(i==36) {
				break outer;//�ӱ�ǩouter:������forѭ����
				//���ѭ��Ҳ����ʹ�ñ�ǩ
			}
		}
		
		*/
		/*��ʽ1
		for(i =1;i<=100;i++) {
			
			 
			if(i%6==0) {	
				System.out.println(i);	
			}
		}
		*/
		
		for(i =1;i<=100;i++) {
			if(i%6!=0) {
				continue;//ֹͣ����ѭ����������һ��ѭ��
			}
			System.out.println(i);	
		}
		
		
	} 
}
