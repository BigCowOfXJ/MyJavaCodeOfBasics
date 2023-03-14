package com.C8_04Extends.C8_05_ExtendDEtail_;

public class c03_Construct_ {
    public static void main(String[] args) {

        //super() 与 this() 必须放在构造器的第一行，间接说明了在
        //构造器中，不能同时出现  super() 和 this() 二者只能使用一个（这是对于一个构造器而言，在创建示例时会通过下一个使用的this第一行调用super，以此类推）
        //

        c02_Son02 s1 = new c02_Son02();
        c02_Son02 s2 = new c02_Son02("jack");
    }
}
