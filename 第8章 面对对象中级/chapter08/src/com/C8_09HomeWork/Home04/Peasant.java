package com.C8_09HomeWork.Home04;

public class Peasant extends Empolyee{
    public Peasant(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public String info(){
        return "农民" + super.info();
    }
}
