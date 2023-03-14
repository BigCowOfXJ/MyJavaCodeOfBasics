package com.C08_InnerClass;

/*
* 由下面代码可得：
* 当局部内部类的属性和对应的外部类属性或方法重名时，不声明的调用
* 默认就近原则，若想使用对应的外部类的属性和方法就应该 对应外部类名.this.相应的属性和方法。
* 对应外部类名.this 其实存放的就是该类的地址，可以将它理解为该对象的实例。
*
* */
public class c02LocalClass02 {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();

        outer03.m1();
        System.out.println("outer03 = " + outer03);
        
    }
}

class Outer03{

    private int n1 = 10;

    private void say(){
        System.out.println("say is running~~~~~~`");
    }

    public void m1(){
        class Inner01{
            private int n1 = 300;

            public void say(){
                System.out.println("say of Inner is running~~~~~~~");
            }
            public void m1(){
                say();
                Outer03.this.say();
                System.out.println(n1);
                System.out.println(Outer03.this.n1);

                System.out.println("Outer03OfHash is = " + Outer03.this);
            }
        }

        Inner01 inner01 = new Inner01();
        inner01.m1();

    }
}
