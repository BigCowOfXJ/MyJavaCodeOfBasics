package com.C8_07MethodFrom;

public class c05_Finalize {
    public static void main(String[] args) {

        C c = new C();
        c = null;
        System.gc();
        System.out.println("=========");

    }
}


class C{

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁c 类");
    }
}