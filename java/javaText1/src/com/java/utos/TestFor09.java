package com.java.utos;

public class TestFor09 {
	public static void main(String[] args){
		/*���1-100�б�5����������ÿ���������
		 
		*/
		//����һ����������
		int count =0;
		for(int i=1;i<100;i++) {
			
			if(i%5==0) {
				
				System.out.print(i+"\t");
				count++;
				if(count%6==0) {
					System.out.println();
				}
			}
		} 
		
		
	}
	
}
