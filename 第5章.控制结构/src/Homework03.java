import java.util.Scanner;
public class Homework03 {
    public static void main(String[] args){
        //判断水仙花数
        Scanner Myscanner = new Scanner(System.in);
        int number = Myscanner.nextInt();
        System.out.println(judge(number));
    }
    public static String judge(int num1){
        int num = num1;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(num > 0){
            i = num % 10;
            sum += (i * i * i);
            j ++;
            num = num / 10;
        }
        if(sum == num1){
            return "sum = " + sum + "是水仙花数";
        }else{
            return "sum = " + sum + "不是水仙花数";
        }
    }
}

        
