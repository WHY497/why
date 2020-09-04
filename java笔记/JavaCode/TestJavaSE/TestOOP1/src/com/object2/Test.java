package com.object2;

public class Test {
    public static void main(String[] args) {
        //创建一个Person类的具体的对象/实体


        //创建对象的过程：
        /*
        * 1.第一次遇到Person的时候】【，进行类的加载（只加载一次）
        * 2.创建对象，为这个对象在堆里开辟空间
        * 3.为对象的属性进行赋值
        *
        * new 关键字实际上是在调用一个方法，这个方法叫做构造方法(构造器)
        可是自己显式，隐式
       [修饰符]构造器的名字(){

       }
       构造器和方法的区别：
       1.没有方法的返回值类型
       2.方法体内部不能return语句
       3.构造器的名字很特殊，必须跟类名一样
        *
        *
       构造器的作用：不是为了创建对象，因为在调用构造器之前，这个对象就已经创建好了，并且属性有默认的初始化值。
       调用构造器的目的是给属性进行赋值操作的。

        *
        注意：我们一般不会在空构造器中进行初始化操作，因为那样的话每个对象的属性就一样。
        */
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.height);

        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.height);

    }
}
