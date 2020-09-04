package com.object;

public class Student {
    byte e;
    short s;
    long num2;
    float f;
    double d;
    boolean bo;
    String name;
    char ch;

    int c;//成员变量：在类中方法外
    public void study(){
        int num;//局部变量：在方法中
        {
            int a;//局部变量：在方法中
        }
        if(1==3){
            int b;
        }
        System.out.println(c);
    }
    public void eat(){
        System.out.println(c);
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.c);
        System.out.println(s.e);
        System.out.println(s.s);
        System.out.println(s.num2);
        System.out.println(s.f);
        System.out.println(s.d);
        System.out.println(s.ch);
        System.out.println(s.bo);
        System.out.println(s.name);

    }
}
