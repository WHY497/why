package com.object.test09;

public class Student extends Person{
    double height;
    double weight;

    public Student() {

    }

    public Student(String name, int age, double height, double weight) {
        super(name, age);
        this.height = height;
        this.weight = weight;
    }
}
