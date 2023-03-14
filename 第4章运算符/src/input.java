
import java.util.Scanner;   //导入java.util的scanner类
public class input {
    public static void main(String[] args){

        //各个常用的都演示一遍
        Scanner myScanner = new Scanner(System.in);  //实例化为一个对象


        char a1;
        int a2;
        long a3;
        float a4;
        double a5;
        String a6;

        a1 = myScanner.next().charAt(0);

        a2 = myScanner.nextShort();

        a3 = myScanner.nextLong();

        a4 = myScanner.nextFloat();

        a5 = myScanner.nextDouble();

        a6 = myScanner.next();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
    }
}
