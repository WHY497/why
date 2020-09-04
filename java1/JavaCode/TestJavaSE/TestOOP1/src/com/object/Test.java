package com.object;

public class Test {//测试类

    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建一个人类的具体的对象/实例
        //创建一个对象，对象的名字叫:zs
        //Person  属于 引用数据类型

        //第一次加载类的时候，会进行类的加载，初始化创建对象的时候，对象的属性没有给赋值，有默认的初始化值
        Person zs =  new Person();
        zs.name = "张三";
        zs.age = 18;
        zs.height = 180.4;
        zs.weight = 135.4;

        //再创建一个对象
        //再次创建类的时候，就不会进行类的加载了，类的加载只在第一次需要的时候加载1一次
        Person ls = new Person();
        ls.name = "张三";
        ls.age = 18;
        ls.height = 180.4;
        ls.weight = 135.4;

        //对属性值进行读取：
        System.out.println(zs.name);
        System.out.println(ls.name);

        //对方法进行操作
        //属性；各个对象的属性是独立的
        //方法：各个对象的方法是共享的
        zs.eat();
        ls.eat();
        zs.sleep("教室");
        String str = zs.introduce();
        System.out.println(str);
    }

}
