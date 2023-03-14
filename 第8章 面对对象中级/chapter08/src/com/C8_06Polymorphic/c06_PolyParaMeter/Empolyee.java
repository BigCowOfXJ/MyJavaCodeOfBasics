package com.C8_06Polymorphic.c06_PolyParaMeter;

public class Empolyee {
    private String name;
    private double salary;

    public Empolyee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnual(){
        return salary * 12;
    }

    public void action(){
        System.out.println("员工都需要工作～～～～～");
    }
}
