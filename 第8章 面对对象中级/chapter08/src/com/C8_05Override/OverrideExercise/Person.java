package com.C8_05Override.OverrideExercise;

public class Person {

    //属性
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void say(){
        System.out.println("name is " + name + "\n" + " age is " + age + "\n");
    }

}
