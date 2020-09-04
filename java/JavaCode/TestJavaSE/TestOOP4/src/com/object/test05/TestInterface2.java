package com.object.test05;

public interface TestInterface2 {
    //常量
    public static final int NUM = 10;

    //抽象方法
    public abstract void a();

    //public default非抽象方法：
    public default void b(){
        System.out.println("xxxxx");
    }

    //静态方法
    public static void c(){
        System.out.println("TestInterface2中的静态方法");
    }


}
class Demo implements TestInterface2{
    @Override
    public void a() {
        System.out.println("重写a方法");
    }

    public static void c(){
        System.out.println("Demo中的静态方法");
    }

}

class A{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.c();
    }
}