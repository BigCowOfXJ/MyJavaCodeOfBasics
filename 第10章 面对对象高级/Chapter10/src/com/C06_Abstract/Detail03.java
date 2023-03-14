package com.C06_Abstract;


public class Detail03 {
    public static void main(String[] args) {

        //抽象类 与  普通类区别
        //抽象类无法被实例化，可以有抽象方法。abstract 返回类型 方法名(形参列表);
        //其他类的特征都有
        System.out.println(Aa.age);
        new Bbb();

    }
}

abstract class Aa{
    public static int age = 10;
    static {
        System.out.println("abstract  类的  静态代码块执行～～～～～～");
    };

    {
        System.out.println("abstract  类的  非静态代码块执行～～～～～～");
    };

    public abstract void say();// 以后的抽象方法都建议 修饰符用 public abstract

    protected abstract void say2();
    abstract void say3();
    //这里报错，因为private 与 abstract 矛盾，该方法无法被外部类访问
    //private abstract void say4();

    //这里报错，因为static 与 abstract 矛盾，该方法无法被外部类访问
    //因为static 属于类，但是又无方法，这样写无任何意义，也是错误语法
    //public static abstract void say();

    //这里也报错
    //因为final修饰的方法无法被子类重写(但是可以被继承)，这是错误的语法
    //public final void say6();
}

class Bbb extends Aa{

    @Override
    public void say() {

    }

    @Override
    protected void say2() {

    }

    @Override
    void say3() {

    }
}


