package com.C8_04Extends.C8_06_ExtendsExercise;

public class c01_Computer {

    //属性
    public String CPU;
    public int cache;
    public int HardDisk;


    public c01_Computer(String CPU, int cache, int HardDisk) {
        this.CPU = CPU;
        this.cache = cache;
        this.HardDisk = HardDisk;
    }

    public void info(){
        System.out.println("CPU is " + CPU + " cache is " + cache + " HardDisk is " + HardDisk);
    }
}
