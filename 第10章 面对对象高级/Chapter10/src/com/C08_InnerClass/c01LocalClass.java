package com.C08_InnerClass;

public class c01LocalClass {

    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.f1();

    }
}

class Outer01 {

    private int age = 100;

    private void say() {
        System.out.println("say is running~~~~~~~~");
    }

    class PartClass {

        /*原因：首先它是局部内部类(相当于局部变量，所以不能用static修饰)，
            原因是PartClass内部类受到Outer01的限制，这里会出现矛盾。
            但是允许有 static final属性的出现，它存在常量池，不需要类的加载。
             */
        //public static int age2 = 12;
        //public static void f2(){}
        public static final int age = 10;
    }

    public void f1() {


        //局部内部类可以类比成员变量
        //所以可以用final 修饰。但是不允许static修饰(不论方法为静态还是非静态)
        class PartClass {

            //下面报错，java中不允许内部类有静态的方法和静态属性
            //public static int age2 = 12;
            //public static void f2(){}

            //内部类可以直接访问对应外部类的任何属性和方法(包括私有的)
            public void say2() {
                System.out.println("say2 is running ~~~~~~~");
                say();
            }
        }

        //static class PartClass02{}
        final class class02 extends PartClass {
        }
        //class class class03 extends class02{}  这里报错,final不能被继承

        PartClass partClass = new PartClass();
        partClass.say2();

    }



}