package com.C8_09HomeWork.Home04;

public class Empolyee {

    private String name;
    private double baseSalary;

    public Empolyee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getSalary(){

        return baseSalary * 12;
    }
    public String info(){

        return name + " 工资为" + getSalary();
    }
}
