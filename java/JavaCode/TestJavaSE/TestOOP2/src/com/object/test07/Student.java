package com.object.test07;

public class Student extends Person{
    double score;
    int age = 20;
    public void study(){
        System.out.println("我......");
    }
    public void eat(){
        System.out.println("我......");
    }
    public void a(){
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
        eat();
        this.eat();
        super.eat();
    }
}
