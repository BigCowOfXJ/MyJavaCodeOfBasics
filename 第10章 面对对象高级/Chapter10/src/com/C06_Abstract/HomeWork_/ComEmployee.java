package com.C06_Abstract.HomeWork_;

public class ComEmployee extends Employee{

    public ComEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    public void work(){
        String message = String.format("普通工人%s 正在进行工作，年工资为%.2f",
                super.getName(), super.getSalary() * 12);
        System.out.println(message);
    }
}
