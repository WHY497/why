package com.java.pojo;
//�߼������
public class TestOpe09 {
	@SuppressWarnings("unused")
	public static void main (String[] args) {
		//�߼��� &:ֻҪһ��������Ϊfalse ����false
		System.out.println(true&true);//
		System.out.println(true&false);//
		System.out.println(false&false);//
		System.out.println(false&true);//
		
		
		//��·��&& :Ч�ʸ�һЩ��ֻҪ��һ�����ʽ��false ;��ô�����false
		System.out.println(true&&true);//
		System.out.println(true&&false);//
		System.out.println(false&&false);//
		System.out.println(false&&true);//
		
		
		//�߼��� | : ֻҪ��һ������ʱtrue ,��ô���һ����true
		System.out.println(true|true);//
		System.out.println(true|false);//
		System.out.println(false|false);//
		System.out.println(false|true);//
		
		//��·�� || :Ч�ʸ�һЩ��ֻҪ��һ�����ʽ��true ;��ô�����true
		System.out.println(true||true);//
		System.out.println(true||false);//
		System.out.println(false||false);//
		System.out.println(false||true);//
		
		//�߼��ǣ�����෴
		System.out.println(!true);//
		System.out.println(!false);//
		
		//�߼����^ :����������ͬ�����Ϊfalse ,����ͬ�����Ϊtrue
		System.out.println(true^true);//
		System.out.println(true^false);//
		System.out.println(false^false);//
		System.out.println(false^true);//
		
		
	}
}
