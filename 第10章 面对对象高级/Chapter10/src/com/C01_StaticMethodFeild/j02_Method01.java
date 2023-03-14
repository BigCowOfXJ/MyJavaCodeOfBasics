package com.C01_StaticMethodFeild;

import java.util.Comparator;

public class j02_Method01 {


    //类的方法（static，静态方法），加载类时就加载了。可以通过类名调用，也可以通过对象名调用
    //但建议用类名访问。
    public static void main(String[] args) {

        Integer[] arr = {12, 23, 42, 12, 2313, 42, 5657};


        //这里就复习了匿名内部类和自定义比较。（Array类的方法会有相关内容）
        mySort.bubble(arr, new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer a = (Integer) o1;
                Integer b = (Integer) o2;

                return a - b;  //a - b 为从小到大
            }
        });

        mySort.bubble(arr, new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer a = (Integer) o1;
                Integer b = (Integer) o2;

                return b - a;  //a - b 为从小到大
            }
        });

        //下面看看静态方法被子类继承是否能被使用（访问允许的前提下）

        //答案：可以被继承并且可以通过子类名调用
        Method02.bubble(arr, new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer a = (Integer) o1;
                Integer b = (Integer) o2;

                return a - b;  //a - b 为从小到大
            }
        });

        Method02.bubble(arr, new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer a = (Integer) o1;
                Integer b = (Integer) o2;

                return b - a;  //a - b 为从小到大
            }
        });

        //静态方法是否能被重载
        //答案：是
        //但是虽然静态方法能被继承，但是不能被重写。子类若是出现同名的静态类，则父类的静态类在子类中被隐藏。
        //好了，太细没意思。就不继续深入了，因为没意义。
        mySort.bubble();
    }
}

class mySort {

    public static void bubble(Integer[] arr, Comparator c) {

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------------------------");
    }

    public static void bubble() {
        System.out.println("重载静态方法实现");
    }


}

class Method02 extends mySort{

}


