package com.C8_05Override.Override01;

public class Test {
    public static void main(String[] args) {

        //小试牛刀
        //说的是方法的重写
        //它与前面学的方法重载不同

        //这里的方法重写细节就不展示代码了，语言描述
        /*
        * 就说重要的几点
        * 1。方法重载
        *   使用范围：一般是同一个类
        *   返回类型:不要求一致
        *   方法名：必须一致
        *   参数列表：至少要有一个不一样
        *   修饰符：无要求
        *
        * 2。方法重写
        *   使用范围：子类重写父类写好的方法
        *   返回类型：与父类一样或是父类返回类型的子类（instanceof）
        *   方法名：必须一致
        *   参数列表：必须一致
        *   修饰符：不能缩小父类方法的访问权限
        *
        * */
        Dog dog = new Dog();
        dog.say();

        Animal an = new Animal();
        an.say();

    }
}
