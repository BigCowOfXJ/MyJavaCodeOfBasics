package com.C8_09HomeWork.Home03;

public class Mange extends Employee{
    private static final double grade = 1.2;
    public Mange(String name , double salary, int day){
        super(name, salary, day);
    }

    @Override
    public double salary() {
        return super.salary() * grade;
    }

    public String info(){
        return "经理" + super.info();
    }
}
