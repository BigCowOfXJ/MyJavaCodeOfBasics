package com.C8_09HomeWork.Home04;

public class Waiter extends Empolyee{
    public Waiter(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public String info(){
        return "服务员" + super.info();
    }
}
