package com.object.test01;

public class PetStore {

    public static Animal getAnimal(String petName){
        Animal an = null;

        if("猫".equals(petName) ){ //防止空指针异常  petName.equals("猫")//有空指针异常
            an = new Cat();
        }
        if("狗".equals(petName) ){ //防止空指针异常  petName.equals("猫")//有空指针异常
            an = new Dog();
        }
        if("猪".equals(petName) ){ //防止空指针异常  petName.equals("猫")//有空指针异常
            an = new Pig();
        }

        return an;
    }
}
