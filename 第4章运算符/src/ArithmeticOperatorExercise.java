import java.util.Scanner;

public class ArithmeticOperatorExercise {
    public static void main(String[] args){
        //题目练习
        //给出华氏温度 求 摄氏温度
        Scanner input = new Scanner(System.in);
        double huashi = input.nextDouble();

        // double sheshi = 5 / 9 * (huashi - 100);  //5 / 9 始终为0，需要转换成double
        double sheshi = 5.0 / 9 * (huashi - 100);

        System.out.println("华氏温度为" + huashi + " 对应的摄氏温度为：" + sheshi);


    }
}
