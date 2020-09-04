package com.object.test03;

public class Girl {
    //属性:
    String name;
    double weight;
    Mom m;/*= new Mom();*/

    //方法:

    public void add(int a){
        System.out.println(a);
        System.out.println(a+100);
    }
    public void love(Boy b){//引用数据类型
        System.out.println("名字"+ b.name +",年龄"+ b.age );
        b.boy();
    }

    //女孩跟妈妈聊天
    public void wechat(){
        m.say();
        System.out.println(weight);
    }


    //构造器
    public Girl(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
