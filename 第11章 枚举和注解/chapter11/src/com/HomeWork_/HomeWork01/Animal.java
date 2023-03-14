package com.HomeWork_.HomeWork01;

public abstract class Animal {
    public abstract Object shout();

    public static void main() {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(cat.shout());
        System.out.println(dog.shout());
    }
}
