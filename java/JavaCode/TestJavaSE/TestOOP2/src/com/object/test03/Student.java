package com.object.test03;

public class Student extends Person {
    //属性
    private int sno;//学号：

    public int getSno(){
        return sno;
    }

    public void setSno(int sno){
        this.sno = sno;
    }

    //方法
    public void study(){
        System.out.println("学生可以学习");
    }

}
