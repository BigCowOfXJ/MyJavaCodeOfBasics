package com.C08_InnerClass;


//这里介绍一下匿名内部类的好处
public class c06AnonymousInnerExercise01 {
    public static void main(String[] args) {

        //要求，创建一个对象，向上转型式传参
        //该对象只使用一次
        //这是传统方法
        show(new Person());

        //下面是匿名类部类的方法
        show(new IA(){
            public void say(){
                System.out.println("Person2 say is running ~~~~~");
            }
        });

        //很明显，匿名内部类会更方便，更易读
        //而传统方法可读性并不好，而且效率低。

    }
    public static void show(IA ia){
        ia.say();
    }
}
interface IA{
    void say();
}

class Person implements IA{
    public void say(){
        System.out.println("Person say is running ~~~~~");
    }
}