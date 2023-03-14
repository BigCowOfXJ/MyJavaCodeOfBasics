import java.util.Scanner;

public class CompareStringAndBreakExercise {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        // 首先聊聊 String 的对比方法
        // 其他的数据类型 用 ==
        String charArr1 = myScanner.next();

        while (!("安老大NB".equals(charArr1))) {
            System.out.printf("输入完全错误\n");
            charArr1 = myScanner.next();

        }
        System.out.printf("输入完全正确\n");

    }
}
