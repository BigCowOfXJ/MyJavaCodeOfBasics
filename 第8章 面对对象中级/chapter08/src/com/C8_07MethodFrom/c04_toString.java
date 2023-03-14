package com.C8_07MethodFrom;

public class c04_toString {
    public static void main(String[] args) {
        B b = new B();
        B b1 = new B();

        System.out.println(b.getClass());

        //值得注意：当直接调用对象的名字时，编译器会自动调用toString 方法
        //该方法可以重写
        //public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }
        System.out.println(b.toString());
        System.out.println(b1);


    }

}

class B{

}
