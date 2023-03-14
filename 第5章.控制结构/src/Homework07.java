import java.util.Scanner;
public class Homework07 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        int sum = caozuo(num);
        System.out.println("sum = " + sum);
    }
    public static int caozuo(int num){

        int i = 0;  
        int sum = 0;

        for(i = 1; i <= num; i++){
            for(int c = 1; c <= i; c ++){
                sum += c;
            }

        }
        return sum;

    }
}
