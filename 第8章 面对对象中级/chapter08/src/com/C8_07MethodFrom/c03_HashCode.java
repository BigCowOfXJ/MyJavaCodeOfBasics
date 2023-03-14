package com.C8_07MethodFrom;

public class c03_HashCode {
    public static void main(String[] args) {

        A a = new A();
        A a1 = new A();

        System.out.println(a == a1);
        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
    }
}
class A{

}