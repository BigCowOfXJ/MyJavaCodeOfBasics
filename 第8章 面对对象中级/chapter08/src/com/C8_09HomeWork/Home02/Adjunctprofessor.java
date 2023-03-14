package com.C8_09HomeWork.Home02;

public class Adjunctprofessor extends Teacher{
    private double point = 1.2;
    public Adjunctprofessor(String name, int age, String post, double salary){
        super(name, age, post, salary);

    }

    @Override
    public String introduce(){
        return "副教授" + getName() + " 年龄为" + getAge() + " 工资为" + (getSalary() * point);
    }

}
