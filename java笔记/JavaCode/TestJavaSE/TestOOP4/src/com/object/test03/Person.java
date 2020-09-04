package com.object.test03;

//4.一个类中如果有方法是抽象方法，，那么这个类也是抽象类
//5.一个抽象可以有0-n个抽象方法

public abstract class Person {
    //1.在一个类中，会有一个方法，子类对这个方法非常满意，无需重写，直接·使用
    public void eat(){
        System.out.println("一顿不吃，饿得慌");
    }
    //2. 在一个类中，会有一个方法，子类对这个方法永远不满意，会对这个方法进行重写
    //3.抽象方法，没有方法体，被abstract 修饰。
    public  abstract void say();
    public  abstract void sleep();

}

//6.抽象类可以被其它类继承
//7.一个类继承一个抽象类，那么这个类可以变成抽象类
//8.一般子类不会加abstract 修饰，一般会让子类重写父类中的方法
//9.子类继承抽象类，就必须重写全部的抽象方法
//10.子类如果没有重写父类全部，抽象方法，那么子类也可以变成一个抽象类
class Student extends Person{
    @Override
    public void say() {
        System.out.println("我xxxxxx");
    }

    @Override
    public void sleep() {
        System.out.println("你xxxxx");
    }
}

class Demo{
    public static void main(String[] args) {
        //11.创建抽象类的对象：-->抽象类不可以创建对象
        //Person p = new Person();

        //12.创建子类的对象：
        Student s = new Student();
        s.sleep();
        s.say();

    //13.多态的写法：父类引用只想子类对象
     Person p = new Student();
     p.sleep();
     p.say();

    }
}





