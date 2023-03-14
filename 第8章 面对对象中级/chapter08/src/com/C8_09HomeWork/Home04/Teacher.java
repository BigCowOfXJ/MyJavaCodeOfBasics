package com.C8_09HomeWork.Home04;

public class Teacher extends Empolyee{

    private int classDay;
    private double classSal;
    public Teacher(String name, double baseSalary, int classDay, double classSal) {
        super(name, baseSalary);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    @Override
    public double getSalary(){
        return super.getSalary() + classDay * classSal;
    }
    public String info(){
        return "教师" + super.info();
    }
}
