package com.C06_Abstract;

public class abstract_ {
    public static void main(String[] args) {

        BB bb = new BB();
        bb.say();
    }
}

//这里就仅仅展示abstract的简单语法和用法


abstract class A09{

    public abstract void say();

    //abstract 方法可以被重载。但不建议这样，
    public abstract int num1(int n1);
     abstract Object num1(int n1, int n2);
}

//BB继承的是抽象类，若没有重写父类(abstract类的抽象方法，会报错)
class BB extends A09{
    public void say(){
        System.out.println("say hello~~~~~~~~");
    }

    public int num1(int num1){
        return num1 * num1;
    }
    public Integer num1(int num1, int num2){
        return num1 * num2;
    }
}


