package com.C8_09HomeWork.Home03;

public class ComEmployee extends Employee{

    private static final double grade = 1.0;
    public ComEmployee(String name , double salary, int day){
        super(name, salary, day);
    }

    @Override
    public double salary() {
        return super.salary() * grade;
    }

    public String info(){
        return "普通员工" + super.info();
    }
}
