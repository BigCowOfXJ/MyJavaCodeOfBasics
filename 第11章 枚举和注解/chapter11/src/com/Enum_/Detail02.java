package com.Enum_;

public class Detail02 {

    public static void main(String[] args) {

    }
}

//综合下面的代码，enum类不能继承其他类，但是能实现接口(多借口)。enu关键字修饰的类默认继承类Enum。
//java的继承是但继承机制
enum AA implements CC{

    AA;
    public void say(){
        System.out.println("hello");
    }
}

abstract class BB{
    public abstract void hi();
}

interface CC{
    void say();
}