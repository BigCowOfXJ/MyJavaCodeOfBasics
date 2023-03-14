package com.HomeWork_.HomeWork02;

@SuppressWarnings({"all"})
public class CellPhone<E> {

    //上面传来的匿名内部类，但是他的本质是Calculate
    //所以这时的匿名内部类传过来给cal运行类型变换了
    //除了匿名内部类可以这样(底层应该进行了优化)

    //其他的不能传入父类的引用给子类，即便是父类引用指向了子类的对象也不行。
    //编译器认为是类型不匹配
    public Double testWork(Calculate cal, Double n1, Double n2) {
        return cal.work(n1, n2);
    }

}
