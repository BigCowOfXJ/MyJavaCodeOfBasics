package com.HomeWork_.HomeWork02;

public class Test {
    public static void main(String[] args) {
        CellPhone<Double> cellPhone = new CellPhone<>();
        //这里使用到匿名内部类
        //除此之外，还有装箱和拆箱
        //值得注意的是：在装箱的过程中，并不会进行自动类型转化。
        //所以不论是装箱还是拆箱，建议类里要一一对应，避免不必要的错误。
        //二这些语法其实没必要太深究，因为本身意义并不大。


        double res = cellPhone.testWork(new Calculate() {
            @Override
            public Double work(Double n1, Double n2){
                return n1 - n2;
            }
        }, 8.0, 10.0);

        //这里的匿名内部类的编译类型是编译器给的
        //但是它的运行类型是Calculate。这个对象的本质是Calculate

        System.out.println(res);
    }

}
