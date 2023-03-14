package com.C06_Abstract.HomeWork_;

public class Manage extends Employee{
    private double bonus;
    public Manage(String name, String id, double salary, double bonus){
        super(name, id, salary);
        this.bonus = bonus;
    }
    public void work(){
        String message = String.format("经理%s 正在进行工作，年工资为%.2f",
                super.getName(), super.getSalary() * 12 + bonus);
        System.out.println(message);
    }
}
