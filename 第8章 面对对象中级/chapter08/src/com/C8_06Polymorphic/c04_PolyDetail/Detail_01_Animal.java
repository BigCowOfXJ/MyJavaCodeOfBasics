package com.C8_06Polymorphic.c04_PolyDetail;

public class Detail_01_Animal {

    public String name;
    public int age;

    public Detail_01_Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("eat is running");
    }

    public void say(){
        System.out.println("say is running");
    }

    public void walk(){
        System.out.println("walk is running");
    }

}
