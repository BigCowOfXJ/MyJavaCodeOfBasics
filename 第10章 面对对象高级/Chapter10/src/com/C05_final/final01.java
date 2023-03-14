package com.C05_final;

public class final01 {
    public static void main(String[] args) {

    }
}

class A{

    //下面这个方法加final，子类是不能继承的(子类会报错)
    public void hi(Integer a){  //重写的形参列表各项的类型必须一摸一样（形参名无要求）
        System.out.println("A hi~~~~~~~~");
    }
}
final class B extends A{
    @Override
    public final void hi(Integer b){   //这里加final允许
        System.out.println("B hi~~~~~~~~~~");
    }
    public final void hi(Integer b, int a){ //final类可以被重载，但不能被重写
        System.out.println("给一身都是胆");
    }
}

class C {  //C无法继承B（final类(最终类)无法被继承）
    //C也无法重写hi(Integer b)方法(最终方法)。
    public final int age = 10;
    //这里不赋初值会报错，可见的final修饰的属性，编译器是不会给默认值的。必须程序员自己设置。(这一点类似局部变量)
    public void changeAge(){
//        age = 12;  这里报错，因为final修饰的属性相当于常量，常量是不能改的
        final int age2 = 20;
//        age2 = 100;    这里报错，因为final修饰的属性和局部变量都是常量，不允许改变。(但这两者的作用范围不一样)
    }
}

