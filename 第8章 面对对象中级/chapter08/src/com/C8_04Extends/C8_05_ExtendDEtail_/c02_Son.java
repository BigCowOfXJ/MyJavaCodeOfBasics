package com.C8_04Extends.C8_05_ExtendDEtail_;

public class c02_Son extends c01_Father {
    public static void main(String[] args) {
        c02_Son son = new c02_Son();
        son.vistNature();
        son.vistMethod();
    }

    public void vistNature() {
        //访问属性
        System.out.println(super.n1);
        System.out.println(super.n2);
        System.out.println(super.n3);
        System.out.println(super.getN4());  //因为私有的属性，这里不能直接访问super.n4，结合封装实现

        //

    }

    public void vistMethod() {
        //访问属性
        super.n5();
        super.n6();
        super.n7();
        super.callN8();  //因为私有的属性，这里不能直接访问super.n8()，结合封装实现

        //

    }
}
