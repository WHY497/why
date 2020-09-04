package com.object.test10;

public class Student extends Person{
    double height;

    public Student() {

    }

    public Student(int age, String name, double height) {
        super(age,name);
        this.height = height;
    }
}
