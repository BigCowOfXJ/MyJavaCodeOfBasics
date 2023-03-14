package HomeWork;

public class HomeWork13 {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        PassObject passObject = new PassObject();

        passObject.printArea(cricle, 5);
    }
}

class Cricle{
    double radius;
    public double getArea(double radius){
        return Math.PI * radius * radius;
    }
}

class PassObject{

    public void printArea(Cricle o1, int num){
        System.out.println("半径" + "\t\t\t" + "面积");
        for (double i = 1; i <= num; i++) {
            System.out.print(i + "\t\t\t" + o1.getArea(i));
            System.out.println();
        }

    }
}
