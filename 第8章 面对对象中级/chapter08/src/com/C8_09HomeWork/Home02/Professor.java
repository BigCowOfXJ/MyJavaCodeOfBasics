package com.C8_09HomeWork.Home02;

public class Professor extends Teacher {

    private double point = 1.3;
    public Professor(String name, int age, String post, double salary){
        super(name, age, post, salary);

    }

    @Override
    public String introduce(){
        return ("教授" + getName() + " 年龄为" + getAge() + " 工资为" + (getSalary() * point));
    }
}
