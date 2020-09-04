package com.object.test04;
/*
1.类是类，接口是接口，他们是同一层次的概念
2.接口没有构造器
3.接口的声明：interface
4.在jdk1.8之前，接口中
（1）常量：固定修饰符public static final
（2）抽象方法:固定修饰符：public abstract
 注意：修饰符可以不写。
* */
public interface TestInterface01 {
    //常量
    public static final int NUM = 10;


    //抽象
    public abstract void a();
    public abstract void b(int num);
    public abstract int c(String name);


}
interface TestInterface02{
    void e();
    void f();
}
/*
5.类和接口的关系是什么？--》实现关系
6.一旦实现一个接口，那么实现类型重写
7.如果没有全部重写抽象方法，那么这个类可以变成一个抽象类
8.Java只有单继承，Java还有多实现
一个类继承其它类，只能直接继承一个父亲
但是实现类实现接口的话，可以实现多个接口
9.写法：先继承，再实现，：extends Person implements TestInterface01,TestInterface02
*/
class Student extends Person implements TestInterface01,TestInterface02{
    @Override
    public void a() {
        System.out.println("---1");
    }

    @Override
    public void b(int num) {
        System.out.println("---2");
    }

    @Override
    public int c(String name) {
        return 100;
    }

    @Override
    public void e() {
        System.out.println("---3");
    }

    @Override
    public void f() {
        System.out.println("---4");
    }
}

class Test{
    public static void main(String[] args) {
        //10.接口不能创建对象
        //TestInterface02 t =new TestInterface01();
        TestInterface02 t = new Student();//接口指向实现类


        //11.接口中常量如何访问：
        System.out.println(TestInterface01.NUM);
        System.out.println(Student.NUM);

        Student s = new Student();
        System.out.println(s.NUM);

        TestInterface01 t2 = new Student();
        System.out.println(t2.NUM);

    }
}