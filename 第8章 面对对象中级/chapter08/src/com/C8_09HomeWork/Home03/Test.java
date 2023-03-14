package com.C8_09HomeWork.Home03;

public class Test {

    public static void main(String[] args) {

        Employee[] es= new Employee[3];

        es[0] = new Employee("jack1",100,365);
        es[1] = new ComEmployee("jack2", 300, 365);
        es[2] = new Mange("jack3", 500, 365);

        show(es);
    }

    public static void show(Employee[] es){
        for (int i = 0; i < es.length; i++) {
            System.out.println(es[i].info());  //这里涉及到动态绑定机制
        }
    }
}
