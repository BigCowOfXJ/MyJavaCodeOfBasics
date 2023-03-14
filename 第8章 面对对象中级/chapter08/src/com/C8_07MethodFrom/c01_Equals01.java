package com.C8_07MethodFrom;


/*
 * 这里聊聊 == 这个运算符
 *
 * */
public class c01_Equals01 {

    public static void main(String[] args) {

        //由下面的测试可以得：== 比较的是值
        //它 既可以是比较基本类型，也可以是引用类型
        //基本类型比较 值是否相等， 引用类型比较的是 地址是否一样。
        int a = 10;
        int b = 10;
        System.out.println(a == b);

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        System.out.println(o1 == o2);
        System.out.println(o3 == o1);

        //equals 方法

        Object c = new Object();
        Object d = new Object();

        System.out.println(c == d); // false == 是比较地址是否相等
        //public boolean equals(Object obj) {
        //        return (this == obj);
        //    }
        System.out.println(c.equals(d));  // false Object 的equals方法还是比较地址

        String n1 = "abcd";

        String n3 = new String("abcd");
        String n2 = "abcd";

        System.out.println(n1 == n2);   // true == 是比较地址是否相等,但是这里没有new，所以优先看看是否先前存有该数据
        System.out.println(n1.equals(n2));  //true ,String 方法重写了 equals方法，因此比较的是内容是否相等
        System.out.println(n1 == n3);
        System.out.println(n1.equals(n3));

    }
}


