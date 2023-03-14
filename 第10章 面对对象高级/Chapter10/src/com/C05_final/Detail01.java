package com.C05_final;


/*
* 综合下面的代码：可得
* 非静态变量必须在原位置上/构造器/非静态代码块  赋值(final修饰的属性和局部常量是不会自动赋初值的)
*
* 静态变量必须在静态代码块上/原位置上赋初值
*
*
* */
public class Detail01 {
    public static void main(String[] args) {
        //final 修饰的类无法被继承，但能被重写。
        System.out.println(AA.AGE1);
       // AA.man();
        AA aa = new AA();


    }
}
final class AA{
    public static final int AGE1 = 10;
    public static final int AGE2 ;
    public static final int AGE3 = 30;
    public final int AGE4 = 40;
    public final int AGE5;
    public final int AGE6;
    public final int AGE7 = retInt();   //可以利用方法赋值
    static{
        //AA.AGE2 = 20;    这样写报错，此时编译器还没加载AA类
        System.out.println("静态代码块被执行～～～～～～");
        AGE2 = 20;      //这是正确的形式
    }


    {
        AGE5 = 50;
    }
    public AA(){
        //AA.AGE3 = 30;   这里报错，因为静态变量无法在构造器中赋初值。
        this.AGE6 = 60;
    }
    public int retInt(){
        System.out.println("AGE7 成功赋值～～～～～");
        return 70;
    }

    //下面这样写无意义，编译器并不会优化，依然会触发加载类。
//    public static final void man(){
//        System.out.println("优化的静态最终类～～～～");
//    }

}
