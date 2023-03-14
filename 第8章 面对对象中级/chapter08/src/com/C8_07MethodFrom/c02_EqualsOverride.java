package com.C8_07MethodFrom;

public class c02_EqualsOverride {

    public static void main(String[] args) {

        Person p1 = new Person("jack",18,'男');
        Person p2 = new Person("jack", 18, '男');

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}


class Person{
    private String name;
    private int age;
    private char gerder;

    public Person(String name, int age, char gerder) {
        this.name = name;
        this.age = age;
        this.gerder = gerder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGerder() {
        return gerder;
    }

    public void setGerder(char gerder) {
        this.gerder = gerder;
    }

    @Override
    public boolean equals(Object o1){
        Person o2 = (Person)o1;
        System.out.println("boolean equals(Object o1) is useing ");
        return this.age == o2.getAge() && this.gerder == o2.getGerder() && this.name.equals(o2.getName());
    }
}
