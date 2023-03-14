package com.C8_09HomeWork.Home04;

public class Worker extends Empolyee {

    public Worker(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public String info(){
        return "普通员工" + super.info();
    }
}
