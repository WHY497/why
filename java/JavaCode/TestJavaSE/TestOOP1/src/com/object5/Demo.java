package com.object5;

public class Demo {
    int id;
    static int sid;

    public void a(){
        System.out.println(id);
        System.out.println(sid);
        System.out.println("----------a");
    }

    //1.static 和 public都是修饰符，并列的没有先后顺序，先写谁后写谁都行
    public static void b(){
        //System.out.println(this.id);//4在静态方法中不能访问和使用this
        //a();//3.在静态方法中不能访问非静态的方法
        //System.out.println(id);//2.在静态方法中不能访问非静态属性
        System.out.println(sid);
        System.out.println("-------b");
    }

    //这是一个main方法，这是程序的入口
    public static void main(String[] args) {
        //5.非静态的方法可以用对象名.方法名去调用
        Demo d = new Demo();
        d.a();

        //6.静态的方法可以,对象名.方法名去调用,也可以用类名.方法名调用
        Demo.b();
        d.b();

        //在同一个类中调用
        b();
    }
}
