package com.object.test01;

public class Girl {

    //属性:
    private int age;
    private int sno;
    private String name;
    private double height;

    //读取年龄：
    public int getAge(){
        return age;
    }

    //设置年龄
    public void setAge( int age){
        if(age >= 30){
            this.age = 18;
        }else{
            this.age = age;
        }
    }

}

