public class c718OverLoadExercise01 {
    public static void main(String[] args) {
        OVExercise ovExercise = new OVExercise();

        ovExercise.m(3);
        ovExercise.m(3, 4);
        ovExercise.m("sdadadadadada");
        System.out.println(ovExercise.max(22, 12.0));  //->double max(double num1, double num2)
        System.out.println(ovExercise.max(22, 12));   //->max(int num1, int num2)
        System.out.println(ovExercise.max(12, 23, 5)); //->max(double num1, double num2, double num3)
    }   
}

class OVExercise{

    public void m(int n){
        System.out.println("n1 的平方 = " + n * n);
    }

    public void m(int n1, int n2){
        System.out.println("n1 * n2 = " + n1 * n2);
    }

    public void m(String str){
        System.out.println("str = " + str);
    }

    public int max(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }

    public double max(double num1, double num2){
        return num1 > num2 ? num1 : num2;
    }

    public double max(double num1, double num2, double num3){
        double midNum =  num1 > num2 ? num1 : num2;

        return midNum > num3 ? midNum : num3;
    }



}
