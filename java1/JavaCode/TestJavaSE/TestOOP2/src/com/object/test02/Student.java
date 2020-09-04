package com.object.test02;

public class Student {
    //属性:

    private int age;
    private String name;
    private String sex;

    //加入对应的setter 和getter方法
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        if("男".equals(sex) || "女".equals(sex)){
            this.sex = sex;
        }else{
            this.sex = "男";
        }
    }
    //加入构造器
    public Student(){

    }
    public Student(int age,String name,String sex){
        this.age = age;
        this.name = name;
        //this.sex = sex;
        this.setSex(sex);
    }


}
