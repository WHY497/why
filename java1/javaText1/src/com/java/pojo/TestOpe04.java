package com.java.pojo;
// ++
public class TestOpe04 {
	public static void main(String[] args) {
		int a = 5;
		a++;// �൱�� a =a+1;
		System.out.println(a);
		
		
	    int	b = 5;
	    ++b;
	    System.out.println(b);
	    //�ܽ᣺++����ʹ�õ�ʱ�����۷���ǰ���Ǻ󣬶��Ǽ�1����
	    
	    //��++ ���뵽������
	    //���򣺿� ++ ��ǰ�����ں����++�ں������㣬���1 �� ���++��ǰ���ȼ�1�������㡣
	    a = 5;
	    int m = a++ + 7;//������  m=a+7,�ټ�1��a=a+1
	    System.out.println(m);//5+7=12
	    System.out.println(a);//6
	    
	    
	    a = 5;
	    int n = ++a + 7;//�ȼ�1 a=a+1 �������㣺 n =a +7;
	    System.out.println(n);//6+7=13
	    System.out.println(a);//6
	}
}
