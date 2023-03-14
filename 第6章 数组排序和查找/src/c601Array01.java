import java.util.Scanner;

public class c601Array01 {
    public static void main(String[] args) throws Exception {
        // 数组入门代码演示
        // 求数组中的平均数
        Scanner myScanner = new Scanner(System.in);
        double[] arr = new double[5];
        double sum = 0;
        double avernum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = myScanner.nextDouble();
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avernum = sum / arr.length;
        System.out.println("平均体重 = " + avernum);
    }
}
