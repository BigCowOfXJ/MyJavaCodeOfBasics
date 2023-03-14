package com.C8_06Polymorphic.c04_PolyDetail;

public class Detail_02_NatureAndCompare {

    public static void main(String[] args) {


        /*
        * 上面讲述细节提到过
        * 1.属性没有重写之分，对于使用了向上/向下转型的对象，其能访问的属性是由编译类型决定（这里不再举例）
        * 2.类的运行类型比较用的是  A instanceof B ->其返回的是true/false
        *
        *   其是对象A 是否是 类B的子类（B这里不能为类的实例对象）
        * */
        A a = new A();
        B b = new B();

        System.out.println(a instanceof B);
        System.out.println(a instanceof A);
        System.out.println(b instanceof A);
        System.out.println(a instanceof Object);

    }


}

class A{}
class B extends A{}
