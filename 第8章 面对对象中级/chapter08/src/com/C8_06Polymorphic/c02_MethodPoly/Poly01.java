package com.C8_06Polymorphic.c02_MethodPoly;

public class Poly01 {

    //方法的多态就说重载和方法的重写
    //但这里还是说说静态的方法重写与重载问题

    public static void main(String[] args) {

        //
        /*
        * 由此可见，静态方法可以被重载
        * 但是静态方法无法实现重载
        *
        * 子类写的静态方法取代了父类的方法，但不属于重写
        *
        * 静态方法无法用super或this访问。
        * */
        Method.sum(1, 2);
        Method.sum(1, 2, 3);
        Method.sum(1, 2, 3, 4);

        Method02.sum(2,3);
        Method02.sum(5,2,3);
        Method02.sum(1,3,4,5,6,7,8);
    }
}

class Method {
    public static void sum(int num1, int num2) {

        System.out.println("sum is " + (num1 + num2));
    }

    public static void sum(int num1, int num2, int num3) {
        System.out.println("sum is " + (num1 + num2 + num3));
    }

    public static void sum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum is " + sum);
    }
}

class Method02 extends Method {


    public static void sum(int num2, int num3) {
        System.out.println("sum is " + (num2 + num3 + 1));
    }
}
