package com.C06_Abstract;

public class Detail01 {
    public static void main(String[] args) {
        //new A01();    //这里报错，abstract类是不能被实例化
        //final 与 abstract
        //final 类 可以被实例化，但是不能被继承
        //abstract 类 可以继承，但是不能被实例化(后面写的interface同左)
        A03 a03 = new A03();
        a03.say();
        a03.say3();
        a03.say2();

        A01 a01 = new A03();
        //a01只能访问say和say3，这联系到前面的动绑定机制
        a01.say();
        a01.say3();

        A02 a02 = new A03();
        //a02 编译类型是A02，所以它只能调用A02特有的方法
        //a02 继承了A01， 所以在访问允许的前提下，A01的方法也可视为A02的特有的伪方法。(虽然不是我打下的江山，但是继承而来的间接也可以视为我自己的)
        a02.say();
        a02.say2();
        a02.say3();
    }
}

abstract class A01{

    public abstract void say();
    public void say3(){
        System.out.println("say3 hello~~~~~~~");
    }

}

abstract class A02 extends A01{
    public void say(){
        System.out.println("say hello~~~~~~");
    }
    public abstract void say2();

}

class A03 extends A02{
    public void say2(){
        System.out.println("say2 hello~~~~~~~");
    }
}
