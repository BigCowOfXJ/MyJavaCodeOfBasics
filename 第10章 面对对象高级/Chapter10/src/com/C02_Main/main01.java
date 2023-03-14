package com.C02_Main;

public class main01 {
    public static void main(String[] abc) {
        /*
        这个探讨main方法
        1.public：JVM调用类时，会自动调用main方法，public确保了夸包访问（但是main方法不一定出现在public类里，别的类也可以有
        main方法，但是只能调用一个自己选定的main方法）
        2.static 确保调用main的时候，JVM不用创建实例来访问。这节约类一定的时间和空间
        3.void就不说了，毕竟c语言基础有
        4.String【】args 是一个数组，可以接收传来的String（字符串）；
        //args只是一个String数组的名字，可以更改，但是建议args看的规范。

         */
        //

        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }




    }
}
