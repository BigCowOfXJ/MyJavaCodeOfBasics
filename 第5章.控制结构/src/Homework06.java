import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        double sum = caozuo(num);
        System.out.println("sum = " + sum);

    }

    public static double caozuo(int num) {
        int i = 2;
        double sum = 1;
        for (; i < num; i++) {
            if (i % 2 == 0) {
                sum -= 1 / (double) i;
            } else {
                sum += 1 / (double) i;
            }
        }
        return sum;
    }
}
