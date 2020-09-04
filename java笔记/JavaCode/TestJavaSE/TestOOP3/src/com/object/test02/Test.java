package com.object.test02;

public class Test {
    public static void main(String[] args) {
        //创建Phone类的对象
        Phone p1 = new Phone("华为P40",1999.9,2008-8-10);
        Phone p2 = new Phone("华为P40",1999.9,2008-8-10);

        //比较两个对象：p1和p2对象
        //==的作用：比较左右两侧的值是否想的，要么相等，返回true,要么不相等,返回false
        System.out.println(p1==p2);//-->对于引用数据类型来说，比较的不是地址值

        //Object类提供了一个方法equals方法：作用：比较对象具体内容是否相等。
        boolean flag = p1.equals(p2);//依旧是==
        System.out.println(flag);//false

        Cat c = new Cat();
        System.out.println(p1.equals(c));
    }
}
