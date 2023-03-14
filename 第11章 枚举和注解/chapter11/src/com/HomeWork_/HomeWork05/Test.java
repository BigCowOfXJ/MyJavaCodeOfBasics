package com.HomeWork_.HomeWork05;

@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        Car car = new Car(12);
        Car car2 = new Car(55);
        Car car3 = new Car(-11);

        Car.Air air = car.new Air();
        Car.Air air2 = car2.new Air();
        Car.Air air3 = car3.new Air();

        air.flow();
        air2.flow();
        air3.flow();

        car.new Air().flow();
        car2.new Air().flow();
        car3.new Air().flow();

    }
}
