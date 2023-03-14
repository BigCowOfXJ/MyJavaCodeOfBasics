package com.HomeWork_.HomeWork05;

public class Car {
    private double temperature;

    public Car(double temperature){
        this.temperature = temperature;
    }
    class Air{
        public void flow(){
            if(temperature < 0){
                System.out.println("空调开启暖风～～～～～～");
            }else if(temperature <= 40){
                System.out.println("空调关闭～～～～");
            }else {
                System.out.println("空调开启冷风～～～～～～");
            }
        }
    }
}
