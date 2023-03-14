import java.util.Scanner;

public class c607ArrayAddAndReduce {

    public static void main(String[] args) {
        Integer[] arr = {};
        char judge = '0';
        Scanner myScanner = new Scanner(System.in);
        // n 表示 不用， y 表示要
        printArr(arr);
        // 这是ADD
        do {
            do {
                judge = myScanner.next().charAt(0);
                if (judge != 'n' && judge != 'y') {
                    System.out.println("输入有误，请重新输入");
                } else {
                    break;
                }
            } while (true);
            if (judge == 'y') {
                int num = myScanner.nextInt();
                arr = Add(arr, num);
            } else {
                break;
            }

        } while (true);
        printArr(arr);
        System.out.println("=========reduce~");

        // reduce
        do {
            do {
                judge = myScanner.next().charAt(0);
                if (judge != 'n' && judge != 'y') {
                    System.out.println("输入有误，请重新输入");
                } else {
                    break;
                }
            } while (true);

            if (judge == 'y'&& arr.length > 0) {
                arr = reduce(arr);
            } else {
                break;
            }

        } while (true);

        printArr(arr);
    }

    // add
    public static Integer[] Add(Integer[] arr, int num) {
        Integer[] arr2 = new Integer[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr.length] = num;
        return arr2;

    }

    // reduce
    public static Integer[] reduce(Integer[] arr) {
        if (arr.length > 0) {
            Integer[] arr2 = new Integer[arr.length - 1];

            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = arr[i];
            }
            return arr2;
        } else {
            System.out.println("数组为空，无法删除");
            return null;
        }
    }

    public static void printArr(Integer[] arr) {

        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("数组为空，无法输出");
        }
    }
}
