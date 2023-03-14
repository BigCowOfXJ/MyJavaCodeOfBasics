import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class nestedBranchExercise {
    public static void main(String[] args) {

        /*
         * 出票系统：根据淡旺季的月份和年龄，打印票价「课后练习]
         * 410旺季：
         * 成人 （18-60）：60
         * 儿童（<18）:半价
         * 老人（>60）:1/3
         * 淡季：
         * 成人：40
         * 其他：20
         */
        Scanner input = new Scanner(System.in);

        int month = input.nextInt();
        int age = input.nextInt();
        if (month >= 4 && month <= 10) {
            System.out.println("处在旺季");
            if (age < 18) {
                System.out.println("未成年旺季半价 30元");
            } else if (age < 60) {
                System.out.println("成年旺季（18 - 60）价格：60元");
            } else {
                System.out.println("老人旺季价格：1 / 3 价 20元");
            }
        } else {
            System.out.println("处在淡季");
            if (age < 18) {
                System.out.println("未成年淡季 20元");
            } else {
                System.out.println("成年淡季 40元");
            }

        }

    }
}
