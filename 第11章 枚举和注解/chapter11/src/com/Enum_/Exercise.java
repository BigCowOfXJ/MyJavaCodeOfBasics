package com.Enum_;

public class Exercise {
    public static void main(String[] args) {

        Person p1 = Person.BOY;
        Person p3 = Person.BOY;
        Person p2 = Person.GIRL;

        //由于Person没有重写子类toString方法，所以调用的是父类的Enum的toString方法
        //    public String toString() {
        //        return name;  （name是对象名 ）
        //    }
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1 == p3); // 指向同一个堆对象地址，T；

    }
}

enum Person{
    //解读：下面这样写是可以的
    //下面BOY和GIRl是创建的对象，调用的是无参构造器
    BOY,GIRL;
}
