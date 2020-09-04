package com.object6;

public class Test {
    //属性
    int a;
    static int sa;


    //方法
    public void a(){
        System.out.println("------a");
        //普通块
        {
            System.out.println("这是普通块");
            //普通块限制了局部变量作用范围
            System.out.println("----00000");
            int num = 10;
            System.out.println(num);
        }


    }

    public static void b(){
        System.out.println("------b");
    }

    //构造块
    {
        System.out.println("------这是构造快");
    }

    //静态块
    static{
        System.out.println("------这是静态块");
        //只能访问静态的属性和方法
        System.out.println(sa);
        b();
    }

    //构造器
    public Test(){

    }
    public Test(int a){
        this.a = a;
    }



    //代码块
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
            Test t = new Test();
            t.a();

            Test t2 = new Test();
            t2.a();
    }


}
