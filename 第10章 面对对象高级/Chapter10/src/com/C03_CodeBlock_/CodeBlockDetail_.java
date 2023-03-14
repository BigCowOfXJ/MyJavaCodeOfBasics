package com.C03_CodeBlock_;

public class CodeBlockDetail_ {
    public static void main(String[] args) {
        /*
        * 当类被加载时，就会优先加载静态代码块和静态属性的调用方法，两者优先级一样。输出顺序和书写顺序一致。
        *
        * */

        //new 一个对象，类就会被加载。就会执行静态属性赋值的方法（默认值为0）和 静态代码块
        //当类被加载时，就会优先加载静态代码块和静态属性的调用方法，两者优先级一样。输出顺序和书写顺序一致。
        //非静态类与静态类相似，进行非静态代码块和非静态属性的调用方法，两者优先级一样
        //A a = new A();
        //调用静态属性，也会触发类的加载
        //System.out.println(A.n1);

        //调用静态方法，也会触发类的加载
        //A.showN1();

        //这里是一个重点
        //用子类名调用父类的静态属性和方法，只会触发父类的加载，并不会触发子类的加载
        //当调用的是子类里声明的静态属性和静态方法，才会先加载父类，再加载子类。
        //BB.showN1();
        //System.out.println(BB.n2);
        //System.out.println(BB.n1);

        //当调用的是子类里声明的静态属性和静态方法，才会先加载父类，再加载子类（先加载父类，再加载子类4）。
        System.out.println(BB.n1);
    }
}

class A {

    public static int n1 = getAndSetN1(10);

    //public int n1 = 20;   这里报错了，由此可见，在同一个类，不管静态还是非静态属性，都不能重名。

    {
        System.out.println("A类的非静态代码块执行～～～～");
    }

    static {
        System.out.println("A类的静态代码块执行～～～～");
    }

    public static int n2 = getAndSetN2(20);

    public static int getAndSetN1(int n1){
        System.out.println("int getAndSetN1(int n1) 被调用");
        return n1;
    }

    public static int getAndSetN2(int n2){
        System.out.println(" getAndSetN2(int n2) 被调用");
        return n2;
    }

    public static void showN1() {
        System.out.println("n1 = " + n1);
    }
}

class BB extends A {
    public static int n1 = 12;

    static {
        System.out.println("B类的代码块执行");
    }


}

