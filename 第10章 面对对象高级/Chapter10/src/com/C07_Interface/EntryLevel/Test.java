package com.C07_Interface.EntryLevel;

public class Test {
    public static void main(String[] args) {

        Camera camera = new Camera();
        Phone phone = new Phone();

        Computer computer = new Computer();

        computer.work(camera);
        computer.work(phone);

        System.out.println("===========");
        USB[] es = new USB[3];
        es[0] = new Camera();
        es[1] = new Phone();
        es[2] = new Phone();

        computer.work(es);

    }
}
