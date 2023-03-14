package com.C8_04Extends.C8_05_ExtendDEtail_;

public class c04_ThisAndSuper {

    public static void main(String[] args) {
        B b = new B();
    }
}

class A{
    public A(String name){
        super();
        System.out.println("A(String name) is runing");
    }
}

class B extends A{
    
    public B(){
        this("jack");
        System.out.println("B() is runninf");
    }
    public B(String name){
        super(name);
        System.out.println("B(String name) is running");
    }
    
}