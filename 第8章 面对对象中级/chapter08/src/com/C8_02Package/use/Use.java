package com.C8_02Package.use;


import com.C8_02Package.Dog02.Dog;
import com.C8_02Package.Dog02.Dog02;
import com.C8_02Package.Dog01.Dog01;
//import com.C8_01Package.Dog01.Dog;

//这里报错了因为不同包的两个相同名字的类，编译器无法识别，只能引入一个
public class Use {

    public static void main(String[] args) {
        Dog01 dog01 = new Dog01();
        Dog dog02 = new Dog();
        //等价于  com.C8_01Package.Dog02.Dog dog02 = new com.C8_01Package.Dog02.Dog();
        com.C8_02Package.Dog01.Dog dog03 = new com.C8_02Package.Dog01.Dog();
        Dog02 dog04 = new Dog02();
    }
}
