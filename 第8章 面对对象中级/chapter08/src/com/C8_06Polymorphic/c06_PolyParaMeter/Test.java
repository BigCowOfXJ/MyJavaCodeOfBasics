package com.C8_06Polymorphic.c06_PolyParaMeter;

public class Test {
    public static void main(String[] args) {

        Empolyee jack = new Empolyee("jack", 5000);
        Empolyee mary = new ComEmpolyee("mary",6000);
        Empolyee john = new Manage("john", 20000, 100000);

        Test.showInof(jack);
        Test.showInof(mary);
        Test.showInof(john);
    }

    public static void showInof(Empolyee person){
        if(person instanceof ComEmpolyee){
            System.out.println(person.getAnnual());
            ((ComEmpolyee)person).work();
        }else if(person instanceof Manage){
            System.out.println(person.getAnnual());
            ((Manage) person).manage();
        }else {
            System.out.println(person.getAnnual());
            person.action();
        }
    }
}
