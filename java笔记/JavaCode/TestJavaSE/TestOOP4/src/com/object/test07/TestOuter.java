package com.object.test07;

/*
* 1.类的组成：属性，方法，构造器，代码块，内部类
* 2.内部类：TestOuter的内部的类叫做内部类
* 3.内部类：成员内部类   和  局部内部类（位置：方法内，块内，构造器内）
* 4.成员内部类：
*    里面属性，方法，构造器
*    修饰符：private,default,protect,public,final,abstract
* */
public class TestOuter {

    //成员内部类：
    public  class D{
        String name;
        int age = 20;
        public void method(){
            //5.内部类可以访问外部类的内容
            /*System.out.println(age);
            a();*/
            int age = 30;
            //8.外部类和内部类属性重名的时候，如何进行调用：
            System.out.println(age);//30
            System.out.println(this.age);//20
            System.out.println(TestOuter.this.age);//10
        }
    }

    //静态成员内部类
     static class E{
        public void method(){
            //6.静态内部类只能访问外部类中被static修饰的
           /* System.out.println(age);
            a();*/
        }
     }

    //属性：
    int age = 10;

    //方法：
    public void a(){
        System.out.println("这是a方法");
        {
            System.out.println("这是一个普通块");
            //内部类
            class B{

            }
        }
        //内部类
        class A {

        }
        //7.外部类想要访问内部类：需要创建内部类的对象，然后进行
        D d = new D();
        System.out.println(d.name);
        d.method();
    }

    //构造块
    {
        System.out.println("这是构造块");
    }

    //静态块
    static {
        System.out.println("这是静态块");
    }

    //构造器
    public TestOuter() {
        //内部类
        class C{

        }
    }

    public TestOuter(int age) {
        this.age = age;
    }
}
class Demo{
    public static void main(String[] args) {
        TestOuter to = new TestOuter();
        to.a();

        //创建内部类的对象
        //非静态的成员内部类创建对象
        TestOuter.E e = new TestOuter.E();

        //非静态的成员内部类
       //错误TestOuter.D d = new TestOuter.D();
        TestOuter t = new TestOuter();
        TestOuter.D d =  t.new D();




    }
}