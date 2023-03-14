package com.C8_09HomeWork.Home02;

public class Lecturer extends Teacher{
    private double point = 1.1;
    public Lecturer(String name, int age, String post, double salary){
        super(name, age, post, salary);

    }

    @Override
    public String introduce(){
        return "讲师" + getName() + " 年龄为" + getAge() + " 工资为" + (getSalary() * point);
    }

}
