public class c608ArrayBubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        BubbleSort(arr);
        printArr(arr);
    }

    public static void BubbleSort(int[] arr) {
        int midNum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    midNum = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = midNum;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
