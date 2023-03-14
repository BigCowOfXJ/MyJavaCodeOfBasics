package com.HomeWork_.HomeWork04;

@SuppressWarnings({"all"})
public class Person {
    public String name;

    public Vehicles tools;

    public Person(String name) {
        this.name = name;
    }

    public void passRiver(){
        tools = Factor.getBoat();
        tools.work();
    }

    public void passRoad(){
        tools = Factor.getHorse();
        tools.work();

    }


}
