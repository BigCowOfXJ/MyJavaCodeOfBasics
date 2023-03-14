import java.util.Scanner;
public class ifAndElseExercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //1.输入两个数，若第一个数大于10并且第二个数小于20，返回num1 - num2 的值
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if(num1 > 10 && num2 < 20){

            System.out.println("满足条件" + (num1 - num2));
        }else{

            System.out.println("不满足条件");
        }

        //2.判断闰年
        //能被4整除但不能被100整除 / 能被400整除

        int year = input.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " 是闰年");
        }else{
            System.out.println(year + "不是闰年");
        }

    }
    
}
