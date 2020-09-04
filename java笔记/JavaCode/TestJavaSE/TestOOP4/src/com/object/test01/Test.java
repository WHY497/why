package com.object.test01;

public class Test {
    public static void main(String[] args) {
        //具体的女孩：-->女孩的对象
        Girl g = new Girl();

       /* //具体的猫：-->猫的对象
        Cat c = new Cat();

        //具体的狗：-->狗的对象
        Dog d = new Dog();

        //小女孩跟猫玩耍
        g.play(c);

        //小女孩跟狗玩耍
        g.play(d);*/

        //具体的动物：-->动物的对象
       /* Cat c = new Cat();
        Animal an = c;*/
       /* Girl g = new Girl();
        Pig p1 = new Pig();
        Animal an = p1;
        g.play(an);*/
       /* Pig p = new Pig();
        Animal an = p;
        an.shout();*/

        Animal an = PetStore.getAnimal("狗");

        g.play(an);
    }
}
