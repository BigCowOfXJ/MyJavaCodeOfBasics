package com.C08_InnerClass.Detail;

public class Dog extends Animal{

    public void say(Dog d1){
        System.out.println("dao is running ~~~~~~");
        d1.say2();
    }

    public void say2(){
        System.out.println("dao2 is running ~~~~~~");
    }
}
