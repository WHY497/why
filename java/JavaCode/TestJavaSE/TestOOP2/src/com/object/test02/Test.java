package com.object.test02;

public class Test {

    public static void main(String[] args) {

        //创建一个Student对象
        Student s1 = new Student();
        s1.setName("nana");
        s1.setAge(19);
        s1.setSex("女");
        System.out.println(s1.getName()+ "---"+ s1.getAge()+"----"+s1.getSex());

        Student s2 = new Student(18,"菲菲","男");
        System.out.println(s2.getName()+ "---"+ s2.getAge()+"----"+s2.getSex());
    }
}
