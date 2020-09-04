package com.object;
/*
*
*
*
*
 */
public class Person {
    //
    //名词-->属性(只把有需要的写在代码，无相关不要写在代码里)

    //成员变量-->放在类中的方法
    int age;//年龄
    String name;//姓名
    double height;//身高
    double weight;//体重


    //动词-->方法
    //吃饭
    public void eat(){
        int num;//局部变量
        System.out.println("我喜欢吃饭");
    }

    //睡觉：
   public void sleep(String address){
        System.out.println("我在"+address+"睡觉");
   }

   //自我介绍
    public String introduce(){
        return "我的名字："+name+",我的年龄："+age+",我的身高："+height+",我的体重："+weight;

    }
}
