package com.C07_Interface;

public class C02Detail {

    public static void main(String[] args) {
        // 接口(interface)无法被实例化，(abstract)抽象类与接口一样也不能被实例化
        //AA aa = new AA();


    }
}

interface AA{
    public abstract void say();    //

    //可以省略 public abstaract 这两个关键字
    void say2();   //这里等同于  public abstract void say2();证明就不证了

}

//普通方法实现接口，必须要实现接口的所以抽象方法
class BB implements AA{

    @Override
    public void say() {}

    @Override
    public void say2() {}
}

//抽象类实现接口不强制要求 实现接口的方法。
abstract class CC implements AA{

    //可见，抽象方法可以被抽象方法重写，但是并无意义。唯一的意义，代码可读性增强。
    public abstract void say();
}
