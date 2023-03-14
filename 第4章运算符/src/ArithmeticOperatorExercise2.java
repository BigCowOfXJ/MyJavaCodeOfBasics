import java.util.Scanner;

public class ArithmeticOperatorExercise2 {
    public static void main(String[] args){

        //给出天数，计算其等价于 几星期 几天

        Scanner input = new Scanner(System.in);

        int day = input.nextInt();
        int week = day / 7;
        int weekDay = day % 7;

        System.out.println(week + "星期 " + weekDay + "天");



    }
}
