package com.object.test01;

public class Demo {
    public static void main(String[] args) {
        Pig p = new Pig();
        Animal an = p;
        an.shout();
        //an.eat();//1.报错原因an在编译期是Animal类型，在Animal中没有eat()，方法，也没有weight属性，
        //an.weight = 60.8;//2.内存 an只能看到0x99空间中的Animal部分的内容

        //加入转型
        //将Animal转为Pig类型
        Pig pig = (Pig)an;//向下转型
        pig.eat();
        pig.age = 10;
        pig.weight = 60.8;

    }
}
