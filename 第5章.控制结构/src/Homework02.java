import java.util.Scanner;

public class Homework02 {
    // 判断数的大小
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);
        int number = MyScanner.nextInt();
        System.out.println(judge(number));
        System.out.println(judge(number));
        System.out.println(judge(number));

    }

    public static String judge(int num) {
        if (num > 0) {
            return "大于0";
        } else if (num == 0) {
            return "等于0";
        } else {
            return "小于0";
        }
    }
}
