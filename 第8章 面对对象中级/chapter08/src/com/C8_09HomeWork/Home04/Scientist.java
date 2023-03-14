package com.C8_09HomeWork.Home04;

public class Scientist extends Empolyee{

    private double bonus;

    public Scientist(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary(){
        return super.getSalary() + bonus;
    }
    public String info(){
        return "科学家" + super.info();
    }
}
