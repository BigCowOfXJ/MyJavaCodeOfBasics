package com.C06_Abstract;

public class Detail02 {
    public static void main(String[] args) {

    }
}

abstract class GrandFather {
    public abstract void say();
    //抽象方法可以实现重载
    public abstract Object say(int num1, int num2);
    public abstract void say2();
}

abstract class Father extends GrandFather{

    //下面这两个抽象方法重写(覆盖)了父类的say和say2
    //
    public abstract void say();
    public abstract void say2();
}

class Son extends Father{
    public void say(){
        System.out.println("say hello~~~~~~");
    }
    public void say2(){
        System.out.println("say2 hello~~~~~~~");
    }

    public Integer say(int num, int num2){
        System.out.println("say2 hello～～～～～～～");
        return num + num2;
    }
}


