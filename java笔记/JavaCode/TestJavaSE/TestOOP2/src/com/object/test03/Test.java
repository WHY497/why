package com.object.test03;

public class Test {
    public static void main(String[] args) {
        //创建子类Student的对象
        Student s = new Student();
        s.setSno(1001);
        s.setAge(18);
        s.setName("菲菲");
        s.setHeight(169.8);

        System.out.println("学生名字："+s.getName()+"\n" +"学生学号："+s.getSno()+"\n" +"学生年龄："+s.getAge()+"\n" +"学生身高："+s.getHeight());
        s.eat();
        s.sleep();
    }
}
