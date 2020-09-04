package com.object7;

import com.object7.Person;//导包:就是为了进行定位

import java.util.Date;
//import java.util.*;//代表util所有的包

public class Test {

    public static void main(String[] args) {
        new Person();
        new Date();
        new java.sql.Date(1000L);//在导包以后，还想用其它包内下同名的类，就必须要手动自己写所在的包。
    }
}
