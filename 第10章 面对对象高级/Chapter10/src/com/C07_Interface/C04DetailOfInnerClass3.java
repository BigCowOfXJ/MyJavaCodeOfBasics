package com.C07_Interface;

public class C04DetailOfInnerClass3 {
    public static void main(String[] args) {


    }
}

interface D01{

    void D01();

    interface D02{
        void Do2sa();
    }
}

//下面这样写并没报错
//可得接口的内部接口(D02)的方法子类可以不实现，只实现接口(D01)的方法就行。
class E01 implements D01{

    @Override
    public void D01() {

    }
}
