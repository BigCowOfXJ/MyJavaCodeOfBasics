package com.C8_09HomeWork.Home04;

public class Test {
    public static void main(String[] args) {

        Empolyee[] es = new Empolyee[5];

        es[0] = new Peasant("jack1",2000);
        es[1] = new Waiter("jack2",2000);
        es[2] = new Worker("jack3",2000);
        es[3] = new Teacher("jack4",2000,100,400);
        es[4] = new Scientist("jac5k",2000,200000);
        show(es);
    }

    public static void show(Empolyee[] es){
        for (int i = 0; i < es.length; i++) {
            System.out.println(es[i].info());
        }
    }
}
