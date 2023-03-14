package com.C8_06Polymorphic.c01_EntryLevel;

public class Animal {

    //属性
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.print( name +  " age is " + age + " 爱吃的");
    }
}
