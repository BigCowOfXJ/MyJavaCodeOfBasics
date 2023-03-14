package HomeWork;

public class HomeWork06 {
    public static void main(String[] args) {
        Operation06 operation06 = new Operation06();
        double num1 = 2;
        double num2 = 0;

        
        System.out.println(operation06.Add(num1,num2));
        System.out.println(operation06.Reduce(num1,num2));
        System.out.println(operation06.Mul(num1,num2));
        System.out.println(operation06.Div(num1,num2));


    }
}

class Operation06{


    public double Add(double num1, double num2){
        return num1 + num2;
    }

    public double Reduce(double num1, double num2){
        return num1 - num2;
    }

    public double Mul(double num1, double num2){
        return num1 * num2;
    }
    public Double Div(double num1, double num2){
        if(num2 == 0){
            System.out.println("除数为0，无法完成除法");
            return null;
        }

        return num1 / num2;
    }
}
