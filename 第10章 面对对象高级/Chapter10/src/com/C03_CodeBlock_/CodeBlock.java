package com.C03_CodeBlock_;

public class CodeBlock {
    public static void main(String[] args) {

        /*
        * 由下面的输出可得：
        * 非静态代码块是构造器的补充。（非静态代码块执行在构造器的前面）
        * 每当创建一个对象，非静态代码块都会执行一次。并且只会执行一次，与构造器一样。
        * 代码块可以有多个，执行顺序与书写的顺序一致。
        *
        * */

        /*
        * 下面代码的执行过程：
        * 1 new 对象先加载类到方法区
        * 2 执行静态代码块和静态属性赋初值的(静态)方法（优先级一样，看顺序）
        * 3 在堆中开辟出一定空间，这是一个对象。
        * 4 给对象的非静态属性赋初值
        * 5 运行构造器
        * 6 在 super(); 或是super(参数)后; 运行
        * 7 执行非静态代码块和非静态属性的赋初值方法（优先级一样，看顺序）
        * 8 执行构造器的方法。
        * */

        Cinema cinema = new Cinema();
        System.out.println(cinema.age);
    }
}

class Cinema {

    public Cinema(int age) {
        this.age = age;
        System.out.println("构造器被调用～～～～～·");
    }
    public Cinema(){
        this(32);
        System.out.println("构造器2被调用～～～～～～");
    }

    public int age3 = 0;
    public int age = setAge();

    {
        System.out.println("--------代码块1--------");
        System.out.println("----------------------");
        System.out.println("======================");
    }

    {
        System.out.println("--------代码块2--------");
        System.out.println("----------------------");
        System.out.println("======================");
    }

    public int age2 = setAge2();
    public int setAge(){

        System.out.println("setAge() is running ");
        return 10;
    }


    public int setAge2(){

        System.out.println("setAge2() is running ");
        return 20;
    }


}
