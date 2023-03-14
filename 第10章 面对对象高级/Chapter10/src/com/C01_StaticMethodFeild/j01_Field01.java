package com.C01_StaticMethodFeild;

public class j01_Field01 {

    public static void main(String[] args) {

        //中和下面的内容，静态的变量是可以被继承的，若在访问允许的情况下
        //子类可以更改父类的静态变量。
        //若子类有重名的情况，则覆盖父类的变量。（属性动态绑定的知识点一样，可以拿来类比）
        System.out.println(field01.num);
        System.out.println(field02.num);
        field02.num = 99;
        System.out.println(field01.num);
    }
}


class field01 {
    public static int num = 100;

}

class field02 extends field01 {

    //public static int num = 80;
}