package com.HomeWork_.HomeWork04;


@SuppressWarnings({"all"})
public class Horse implements Vehicles{

    public static Horse getHorse() {
        return new Horse();
    }

    @Override
    public void work(){
        System.out.println("使用白龙马/赤兔马 前行～～～～～～");
    }
}
