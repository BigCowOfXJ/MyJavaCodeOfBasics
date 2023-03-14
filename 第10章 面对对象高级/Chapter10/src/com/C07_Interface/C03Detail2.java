package com.C07_Interface;



public class C03Detail2 {
    public static void main(String[] args) {

        A01 b01 = new B01();

        //下面两个报错。属于接口的方法和属性 ，不能用其实现子类的对象名访问，只能用接口名访问/
        //静态属性的继承和普通类一样，虽被继承，但是无法重写，叫覆盖。

        System.out.println(b01.age);
        System.out.println(b01.age0);

        //这里报错，因为接口的静态方法比较特殊，接口的静态方法只能用接口名调用。
        //b01.say();

        //虽然子类名可以调用接口静态方法，但不建议这样。
        //首先这样写，代码可读性不好。其次，它也不是规范的使用。而且这样记会记混，而且无意义。
        //但是要知道有这么回事。
        A01.say();

        B03 b03 = new B03();
        System.out.println(b03.age3);
        //这里报错，因为编译器无法识别age到底拿接口A01还是类C01的。
        //System.out.println(b03.age);
        b03.say2();
        //这里同上面分析的。
        //b03.say();

    }
}
interface A01{
    public final static int age = 10;   //这是个常量值，不能更改

    int age0 = 100;  //   等同于：public final static int age2 = 12;
    public static void say(){
        System.out.println("say is running~~~~~");
    }
}
interface A02 {}

//可见得：接口可以继承多个接口,只能继承接口(抽象类也不行)
interface A03 extends A01, A02{}

class C01{
    public final static int age = 20;
    public int age3 = 30;

    public static void say2(){
        System.out.println("say2 is running~~~~~");
    }
}

//可以见得：一个普通类(包含抽象类)
class B01 implements A01, A02, A03{}
abstract class B02 extends C01 implements A01, A02, A03{}

class B03 extends C01 implements A01, A02, A03{}
