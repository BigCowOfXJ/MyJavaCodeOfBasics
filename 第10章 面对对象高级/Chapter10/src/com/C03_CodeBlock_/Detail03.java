package com.C03_CodeBlock_;

public class Detail03 {
    public static void main(String[] args) {

        //当这样定义a时，不会进行类的加载
        AA a = null;
    }
}
class AA{
    static{
        System.out.println("static CodeBlock~~~~~~~~");
    };
    public static void say(){
        System.out.println("say hello~~~~~~~");
    }
}


