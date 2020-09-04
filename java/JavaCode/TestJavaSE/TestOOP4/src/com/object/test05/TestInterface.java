package com.object.test05;

public interface TestInterface {
    //常量：
    public static final int NUM = 10;


    //抽象方法：
    public abstract void a();


    //被pubic default 修饰的非抽象方法
    public default void b(){
        System.out.println("-----TestInterface---b()--");
    }

}

class Test implements TestInterface{
    public void c(){
        //想要用一下B方法
        b();
        //super.b();//no
        TestInterface.super.b();//yes
    }
    @Override
    public void a() {
        System.out.println("重写了a方法");
    }

    @Override
    public void b() {

    }
}