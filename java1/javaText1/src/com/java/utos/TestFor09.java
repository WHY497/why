package com.java.utos;

public class TestFor09 {
	public static void main(String[] args){
		/*输出1-100中被5整除的数，每行输出六个
		 
		*/
		//引入一个计数器：
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
