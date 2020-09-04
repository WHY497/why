package com.object3;

public class Test {
    //这是程序的入口
    public static void main(String[] args) {
        /*
        1.一般保证空构造器的存在，空构造器一般不会进行赋值操作
        2.一般我们重载构造器，在重载构造器中进行属性赋值操作
        3.假如在重载构造器以后，假如空构造器忘写了,系统也不会给你分配默认的空构造器了，那么你要调用的话就会出错了



        */
        Person p = new Person();

        /*name = "lili";//name:null
        age = 19;//age:0
        height = 169.5;//height:0.0*/

        Person p2 = new Person("lili",19,188.4);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.height);


    }
}
