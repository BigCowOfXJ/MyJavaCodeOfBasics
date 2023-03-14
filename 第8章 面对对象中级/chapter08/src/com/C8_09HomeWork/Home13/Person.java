package com.C8_09HomeWork.Home13;

public class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play(){
       return "这是父类Person类的Play（）";
    }

    public String printInfo() {
        return "姓名：" + name + "\n" +
                "年龄：" + age + "\n" +
                "性别：" + sex + "\n";
    }
}
