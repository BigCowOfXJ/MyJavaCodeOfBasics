package com.HomeWork_.HomeWork04;

import com.sun.deploy.util.VersionID;

@SuppressWarnings({"all"})
public class Boat implements Vehicles {


    public static Boat getBoat(){
        return new Boat();
    }
    @Override
    public void work(){
        System.out.println("使用潜艇 前行～～～～～～");
    }
}
