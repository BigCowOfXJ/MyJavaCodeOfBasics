import java.util.Scanner;

public class c604ArrayExerciseo2 {
    public static void main(String[] args) {
        // 寻找数组中的最大值

        Scanner myScanner = new Scanner(System.in);
        double[] arr = {};
        // double[] arr = new double[5];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = myScanner.nextDouble();
        // }
        MaxNumMathod(arr);

    }

    public static void MaxNumMathod(double[] arr) {
        Double num = Maxnum(arr);
        if (num != null) {
            System.out.println("最大数 = " + num);
        } else {
            System.out.println("数组为空 或 地址为空");
        }
    }

    public static Double Maxnum(double[] arr) {
        double MaxNum = 0;

        if (arr != null && arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (MaxNum < arr[i]) {
                    MaxNum = arr[i];
                }
            }
            return MaxNum;
        }
        return null;

    }
}
