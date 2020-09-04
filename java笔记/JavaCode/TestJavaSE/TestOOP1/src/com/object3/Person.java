package com.object3;

public class Person {

    //属性
    String name;
    int age;
    double height;

    //空构造器
    public Person(){

    }

    public Person(String name, int age, double height){
        //当形参名字和属性名字重名的时候，程序出现就近原则。解决方法，在属性名字前加关键字this.
        //在要表示对象的属性前加上this.来修饰,因为this代表的就是你创建的那个对象
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //方法
    public void eat(){
        System.out.println("我喜欢吃饭");
    }
}
