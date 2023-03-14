import java.util.Scanner;

public class Homework04 {
    // 打印 1-输入 的能被5整除的数
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        int i = 1;
        for (; i <= num; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
