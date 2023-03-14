package HomeWork;

import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        double radius = myScanner.nextDouble();

        Operation05 operation05 = new Operation05();
        operation05.setRadius(radius);


        System.out.println( operation05.getArea());
        System.out.println(operation05.getPerimeter());
        


    }
}

class Operation05{
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }


    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

}
