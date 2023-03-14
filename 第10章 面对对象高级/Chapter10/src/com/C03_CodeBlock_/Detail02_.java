package com.C03_CodeBlock_;

public class Detail02_ {
    public static void main(String[] args) {


//        System.out.println(Oper1.age);
//        Oper1 oper1 = new Oper1();
//        Oper1 oper1 = new Oper1();

        //System.out.println(Oper02.age);
        Oper02 oper02 = new Oper02();

        System.out.println(oper02.age + "sasbabs");
        //这里得出结论：静态方法无法重写，无动态绑定机制
        //静态方法的调用和属性一样，哪里调，哪里就用。

        System.out.println(oper02.age2 + "sasbabs");
    }
}

class Oper1{

    {
        System.out.println("非静态代码块执行");
    }

    static int age = reAge();
     int age2 = reAge2();

    {
        System.out.println("非静态代码块2执行");
    }

    static{
        System.out.println("静态代码块1");
    }

    static{
        System.out.println("静态代码块2");
    }

    public static int reAge(){

        System.out.println("static reAge()执行");
        return 10;
    }

    public int reAge2(){

        System.out.println("reAge2()执行");
        return 20;
    }


}

class Oper02 extends Oper1{

    {
        System.out.println("02  的非静态代码块1");
    }

    {
        System.out.println("02  22222非静态代码块执行");
    }

    static int age1 = Oper02.reAge();
    int age3 = reAge2();

    {
        System.out.println("02   非静态代码块2执行");
    }

    static{
        System.out.println("02     静态代码块1");
    }

    static{
        System.out.println("02     静态代码块2");
    }

    public static int reAge(){

        System.out.println("02    static reAge()执行");
        return 30;
    }

    public int reAge2(){

        System.out.println("02    reAge2()执行");
        return 40;
    }
}
