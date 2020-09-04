package com.object4;

public class Person {
    //属性
    int age;
    String name;
    double height;

    //空构造器
    public Person(){

    }
    //有参构造器
    public Person(int a,String b, double c){
            age  = a;
            name = b;
            height = c;
    }

    //方法
   /* public void eat(){
         int age = 10;
        System.out.println(age);//就近原则，age指的离它近的age--> 局部变量age
        System.out.println(this.age);//属性age
        System.out.println("我喜欢睡觉");
    }*/
    public void play(){
        this.eat();
        System.out.println("吃饭");
        System.out.println("上网");
    }

    public void eat(){
        System.out.println("吃饭");
        System.out.println(this.age);
    }
}
