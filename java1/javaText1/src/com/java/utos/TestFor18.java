package com.java.utos;

public class TestFor18 {
	public static void main(String[] args) {
		//�ȴ�ӡ��һ�������Σ�Ȼ��ĳЩλ���ϴ�ӡ*��ĳЩλ�ô�ӡ�ո�
		//******
		int size = 5;
		int startNum =size/2+1;//��ʼ�к�
		int endNum =size/2+1;//�����к�
		//����һ���������͵ı��� --����⿪��
		boolean flag = true;
		for(int j=1;j<=size;j++) {
			
			for(int i=1;i<=size;i++) {
				if(i>=startNum && i<=endNum) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//����
			System.out.println();
			
			if(endNum==size) {
				flag=false;
				
			}
			
			if(flag) {
				startNum--;
				endNum++;
			}else {
				startNum++;
				endNum--;
			}
				
		}
	}
}
