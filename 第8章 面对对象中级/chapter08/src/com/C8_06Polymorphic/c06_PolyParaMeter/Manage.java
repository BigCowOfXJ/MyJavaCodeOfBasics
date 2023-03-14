package com.C8_06Polymorphic.c06_PolyParaMeter;

public class Manage extends Empolyee {
    private double bonus;

    public Manage(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public void manage() {
        System.out.println("经理" + super.getName() + "正在管理员工～～～～");
    }
}
