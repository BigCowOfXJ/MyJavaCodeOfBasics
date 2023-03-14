package com.C8_04Extends.C8_06_ExtendsExercise;

public class c04_Pc extends c01_Computer{
    public String brand;

    public c04_Pc(String CPU, int cache, int HardDisk, String brand) {
        super(CPU, cache, HardDisk);
        this.brand = brand;
    }

    @Override
    //这里是子类重写
    public void info(){
        System.out.print("brand is " + brand + " ");
        super.info();
    }
}
