package com.C07_Interface;

public class Exercise {
    public static void main(String[] args) {

        Son2 son2 = new Son2();

        son2.show();

    }
}
interface Father{
    int x = 10;
}

class Son1{
    public int x = 20;

    public static int x2 = 30;

}
class Son2 extends Son1 implements Father{

    public void show(){

        //下面报错，因为x的来源并不明确
        //System.out.println(x);

        System.out.println(super.x);
        System.out.println(Father.x);

        //虽然下面没报错，但是还是给出了警告，所以并不推荐下面的调用形式。推荐第二种
        System.out.println(super.x2);
        System.out.println(Son1.x2);
    }
}

