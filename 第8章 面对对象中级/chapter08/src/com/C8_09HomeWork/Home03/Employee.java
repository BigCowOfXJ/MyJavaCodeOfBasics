package com.C8_09HomeWork.Home03;

public class Employee {
    private String name;
    private double salary;
    private int day;

    public Employee(String name, double salary, int day) {
        this.name = name;
        this.salary = salary;
        this.day = day;
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double salary(){
        return salary * day;
    }

    public String info(){
        return name + "年工资为" + salary();
    }

}
