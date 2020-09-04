package com.object.test03;

public class Test {
    public static void main(String[] args) {
        //一个创建Boy类的具体的对象
        Boy boy = new Boy(30,"xxx");
        //创建一个Girl类的具体的对象
        Girl girl = new Girl("xxx",100);

        //

        girl.love(boy);

        Boy boy2 = new Boy(35,"xx");

        girl.love(boy2);

        //微信聊天
        girl.m = new Mom();
        girl.wechat();

    }
}
