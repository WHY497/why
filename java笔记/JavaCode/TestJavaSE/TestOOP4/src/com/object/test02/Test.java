package com.object.test02;

public class Test {

    public static void main(String[] args) {
       final int A = 103;//final修饰变量，变成常量，变量不能再改变，名字必须大写,final 修饰基本数据类型
       // A = 20;//报错

        final Dog d = new Dog();//final 修饰引用数据类型，那么地址值不能改变
        //d = new Dog();
        d.age = 10;
        d.weight = 13.7;

        //第三种情况
        final Dog d2 = new Dog();
        a(d2);

        //第四种情况
        b(d2);//
    }
    public static void a(Dog d){
        d = new Dog();
    }
    public static void b(final Dog d){//d被final修饰，指向不可以改变

        //d = new Dog();//报错
    }
}
