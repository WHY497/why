package com.object11;

import static java.lang.Math.*;//导入 java.lang.Math类中的静态的内容。

public class Test {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.PI);
        //System.out.println(Math.round(5.6));
        System.out.println(round(5.6));
    }
    //在静态导入后，同一个类中有相同的方法的hi后，会优先先走自己定义的方法。
    public static int round(double a){
        return 1000;
    }
}
