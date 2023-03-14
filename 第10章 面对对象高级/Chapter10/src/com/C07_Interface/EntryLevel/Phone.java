package com.C07_Interface.EntryLevel;

public class Phone implements USB{

    //下面报错，继承的接口方法不能为静态的方法。其实意义上这两者互相矛盾。
    //public static void start(){}
    public void call(){
        System.out.println("phoneOfCall is running ");
    }

    public void start(){
        System.out.println("Phone start is running~~~~");
    }

    public void end(){
        System.out.println("Phone end is running~~~~");
    }
}
