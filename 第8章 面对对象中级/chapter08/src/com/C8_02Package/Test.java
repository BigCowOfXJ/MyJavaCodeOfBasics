package com.C8_02Package;

import com.C8_02Package.Dog01.Dog01;
import com.C8_02Package.Dog02.Dog02;


//根据上述包的引入可以得出

/*
虽然包Dog01 与 包Dog02 和 包use  以及  Test.java文件 同属于一个包  com.C8_01Package
但是 Dog01包的类认为是属于Dog01包，不属于com.C8_01Package
Dog02与use同理

但是Test.java 属于包com.C8_01Package

所以Test在用包Dog01 与 包Dog02 和 包use的类时，必须导入包。
 */
public class Test {

    Dog01 dog01 = new Dog01();
    com.C8_02Package.Dog02.Dog dog02 = new com.C8_02Package.Dog02.Dog();
    //等价于  com.C8_01Package.Dog02.Dog dog02 = new com.C8_01Package.Dog02.Dog();
    com.C8_02Package.Dog01.Dog dog03 = new com.C8_02Package.Dog01.Dog();
    Dog02 dog04 = new Dog02();
}
