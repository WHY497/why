package com.object.test08;

public class Student extends Person{
    double score;

    public Student(){
       /* super();*/
    }
    public Student(double score){
        super();
        this.score = score;
    }

    public Student(int age,String name,double score){
        //super();
        /*this.name = name;
        this.age = age;*/
       /* super.name = name;
        super.age = age;*/
        super(age,name);//利用Super调用父类构造器
        this.score = score;
    }

}
