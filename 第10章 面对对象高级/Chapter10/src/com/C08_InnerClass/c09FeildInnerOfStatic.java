package com.C08_InnerClass;

/*
 * 这里介绍静态内部类
 *
 *
 *
 * */
public class c09FeildInnerOfStatic {
    public static void main(String[] args) {

        //外部其他类获取静态内部类的方法

        Outer11 outer11 = new Outer11();

        //方式一：
        //这与成员内部类定义不同。
        Outer11.Inner inner = new Outer11.Inner();

        inner.say3();

        //方式二
        Outer11.Inner inner2 = Outer11.getInstance();
        Outer11.Inner inner3 = outer11.getInstance();
        inner2.say3();
        inner3.say3();

    }
}

class Outer11 {
    private int n1 = 10;
    private static int n2 = 20;
    private static final int n3 = 30;

    public void say() {
        System.out.println("Outer11 say is running ~~~~~~");
    }

    public static void say2() {
        System.out.println("Outer11 say2 is running ~~~~~~");
    }


    //静态内部类和成员内部类可以使用 public protected 默认 private修饰赋修饰
    //内部类可以是普通类，接口，和抽象类
    public abstract static class Inner2 {}
    public static interface Inner3 {}
    public static class Inner {
        private int n1 = 40;
        //因为是静态内部类，所以这里可以出现静态变量和静态属性
        private static int n2 = 50;
        private static final int n3 = 60;

        public void say() {
            System.out.println("Inner say is running ~~~~~~");
        }

        public static void say2() {
            System.out.println("Inner say2 is running ~~~~~~");
        }

        public void say3() {
            //下面三遵循就近原则
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);

            //System.out.println(Outer11.this.n1);    //这里报错，静态类使用时，对应的外部类可以不加载
            //System.out.println(Outer11.this.n2);    //这里报错，同上
            System.out.println(Outer11.n2);
            System.out.println(Outer11.n3);

            //下面两遵循就近原则
            say();
            say2();

            //下面这里报错，原因同上
            //Outer11.this.n2
            Outer11.say2();


        }
    }

    public static Inner getInstance(){
        return new Inner();
    }

    public Inner getInstance2(){
        return new Inner();
    }

}
