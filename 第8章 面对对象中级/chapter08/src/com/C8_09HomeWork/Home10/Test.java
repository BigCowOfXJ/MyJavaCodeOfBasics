package com.C8_09HomeWork.Home10;

public class Test {
    public static void main(String[] args) {

        Person person = new Person("jack", 18,"程序员", '男',20000);
        Person person2 = new Person("jack", 18,"程序员", '男',20000);

        System.out.println(person2 == person);
        System.out.println(person2.equals(person));
    }
}
