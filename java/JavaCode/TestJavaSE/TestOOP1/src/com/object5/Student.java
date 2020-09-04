package com.object5;

public class Student {
    //属性：
    String name;
    int age;
    static String school;

    //这是一个main方法，是程序的入口:
    public static void main(String[] args) {
            Student.school = "信息学院";

            //创建学生对象
            Student s1 = new Student();
            s1.name = "张三";
            s1.age = 19;
            //s1.school = "信息学院";

            Student s2 = new Student();
            s2.name = "李四";
            s2.age = 21;
            //s2.school = "信息学院";


            System.out.println(s2.school);
    }
}
