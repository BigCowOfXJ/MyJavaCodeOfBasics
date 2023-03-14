package com.C05_final;

public class Exercise {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.length());
        System.out.println(circle.area());
    }
}

final class Circle{

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double length(){
        return 2 * Math.PI * radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}
