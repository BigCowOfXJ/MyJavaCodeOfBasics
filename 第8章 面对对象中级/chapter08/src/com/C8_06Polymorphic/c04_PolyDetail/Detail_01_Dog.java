package com.C8_06Polymorphic.c04_PolyDetail;

public class Detail_01_Dog extends Detail_01_Animal {

    public double AveragLength = 20;
    public Detail_01_Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("小狗 喜欢骨头");
    }

    public void action2(){
        System.out.println("狗 可以看家");
    }
}
