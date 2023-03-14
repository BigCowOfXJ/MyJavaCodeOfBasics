import java.util.Scanner;

public class ForExercise {
    public static void main(String[] args) {
        // 题一 求1 - 输入的数中，输出是9 的倍数的数
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 9 == 0)
                System.out.println(i);

        }

        // 题二 完成输出
        // 1 + 4 = 5
        // 2 + 3 = 5
        // 3 + 2 = 5
        // 4 + 1 = 4

        // 先死后活，化繁为简
        int number1 = myScanner.nextInt();
        int i = 0;
        for (; i < number1; i++) {
            System.out.println(i + " + " + (number1 - i) +
                    " = " + number1);

        }

    }
}
