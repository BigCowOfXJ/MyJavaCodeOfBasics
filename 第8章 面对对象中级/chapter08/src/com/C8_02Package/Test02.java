package com.C8_02Package;

import com.C8_02Package.FangWen.Father;
//import com.C8_02Package.FangWen.Father2;  Father2不是公共类，无法在不同包访问

public class Test02 extends Father{
    public static void main(String[] args) {
        Father father = new Father();
        //经过测试得：不同包的类进行继承，只能访问public 修饰的类与方法

    }
}
