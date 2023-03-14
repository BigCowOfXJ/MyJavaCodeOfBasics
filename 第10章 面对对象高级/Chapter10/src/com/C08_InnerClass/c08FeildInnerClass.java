package com.C08_InnerClass;

public class c08FeildInnerClass {
    public static void main(String[] args) {

        //创建成员内部类的方法
        //成员内部类和静态内部类是外部其他类可以访问的
        //但是局部内部类和匿名内部类不行。

        //方法一
        Outer09 outer09 = new Outer09();
        Outer09.Inner09 inner = outer09.new Inner09();
        inner.say3();


        //方法二
        //在对应的外部类里定义一个方法，返回一个内部类对象。
        Outer09.Inner09 inner02 = outer09.getInstanceOfInnerClass();
        inner02.say3();



    }


}


//这里主要展示成员内部类
class Outer09 {

    private int n1 = 10;
    private static int n2 = 20;
    private static final int n3 = 30;

    public Inner09 getInstanceOfInnerClass(){
        return new Inner09();
    }

    public void say() {
        System.out.println("Outer09 say is running ~~~~~~");
    }

    public static void say2() {
        System.out.println("Outer09 static say2 is running ~~~~~~");
    }

    //成员内部类和静态内部类可以类比成属性
    //局部内部类和匿名内部类可以类比成局部变量
    class Inner09 {
        private int n1 = 50;
        //下面报错，因为非静态内部类不允许出现静态变量和静态属性
        //private static int n2 = 60;
        private static final int n3 = 70;  //存在于常量池，与静态域无关。

        //不是重写
        public void say() {
            System.out.println("inner say is running ~~~~~~~");
        }

        //这里没报错，因为Inner没有继承对应外部类，所以say2 与 外部类的 say2 是互不影响的，不构成重写关系
        public void say2() {
            System.out.println("inner say2 is running ~~~~~~~");
        }
        //下面报错，因为非静态内部类不允许出现静态属性(除了final修饰的)和静态方法
        //public static void say2() {}

        public void say3() {
            //下面三遵循就近原则
            System.out.println(n1);    //内部类的n1
            System.out.println(n2);    //外部类的n2
            System.out.println(n3);    //内部类的n3

            System.out.println(Outer09.this.n1);
            System.out.println(Outer09.this.n2);
            System.out.println(Outer09.this.n3);

            say();
            Outer09.this.say();

            say2();
            Outer09.this.say2();
            Outer09.say2();  //推荐这样写

        }

    }
}
