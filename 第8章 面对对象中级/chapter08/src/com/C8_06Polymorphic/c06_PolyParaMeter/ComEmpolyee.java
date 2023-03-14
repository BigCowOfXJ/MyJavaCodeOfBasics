package com.C8_06Polymorphic.c06_PolyParaMeter;

public class ComEmpolyee extends Empolyee{

    public ComEmpolyee(String name, double salary){
        super(name, salary);
    }

    public void work(){
        System.out.println("员工" + super.getName() + "正在工作～～～～～");
    }
}
