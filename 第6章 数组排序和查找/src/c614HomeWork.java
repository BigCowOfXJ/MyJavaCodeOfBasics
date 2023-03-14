import java.util.Scanner;

public class c614HomeWork {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 34, 45, 56 };

        Scanner myScanner = new Scanner(System.in);

        int InsertNum = myScanner.nextInt();

        arr = InsertOperation(arr, InsertNum);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] InsertOperation(int[] arr, int num) {
        int indexes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                indexes = i;
                break;
            }
            if (i == arr.length - 1) {
                indexes = arr.length;
            }
        }
        
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < arr2.length; i++) {
            if (i < indexes) {
                arr2[i] = arr[i];
            } else if (i == indexes) {
                arr2[i] = num;
            } else {
                arr2[i] = arr[i - 1];
            }
        }
        return arr2;

    }
}
