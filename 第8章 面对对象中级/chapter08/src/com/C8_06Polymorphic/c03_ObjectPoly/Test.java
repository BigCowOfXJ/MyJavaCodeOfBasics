package com.C8_06Polymorphic.c03_ObjectPoly;

public class Test {
    //这里体验一下
    //对象的多态
    //其实就是  编译类型 和 运行类型 不一致
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.say();
        dog = new Animal();
        dog.say();
    }
}
