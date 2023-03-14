package com.C8_04Extends.C8_05_ExtendDEtail_;

public class c02_Son02 extends c01_Father{

    public c02_Son02(){
        //这里编译器会自动加入super();
        System.out.println("Son02(){....} is useing");
    }

    public c02_Son02(String name){
        super(name);
        System.out.println("Son02(String name){....}  is running");
    }
}
