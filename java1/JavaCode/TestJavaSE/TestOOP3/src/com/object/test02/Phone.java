package com.object.test02;

import java.util.Objects;

public class Phone {//手机类
    //属性：
    private String brand;//品牌型号
    private double prise;//价格
    private int year;//出场年份

    //方法

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //构造器

    public Phone() {

    }

    public Phone(String brand, double prise, int year) {
        this.brand = brand;
        this.prise = prise;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", prise=" + prise +
                ", year=" + year +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.prise, prise) == 0 &&
                year == phone.year &&
                Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, prise, year);
    }
}

