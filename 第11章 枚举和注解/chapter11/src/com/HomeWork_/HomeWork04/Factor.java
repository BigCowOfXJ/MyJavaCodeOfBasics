package com.HomeWork_.HomeWork04;

public class Factor {
    private final static Horse horse = new Horse();
    private final static Boat boat = new Boat();

    private Factor(){}

    public static Horse getHorse(){
        return horse;
    }

    public static Boat getBoat(){
        return boat;
    }
}
