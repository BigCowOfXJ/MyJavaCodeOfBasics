public class c606ArrayReverse {
    public static void main(String[] args) {
        // 数组翻转

        // 1 逆序赋值
        int[] arr = { 11, 22, 33, 44, 55, 66 };

        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {

            System.out.println(arr2[i]);
        }
        arr = arr2;

        // 2 招规律
        System.out.println("========～找规律～=====");
        j = arr.length - 1;
        int midNum = 0;
        for (int i = 0; i <= arr2.length / 2 - 1; j--, i++) {
            midNum = arr[i];
            arr[i] = arr[j];
            arr[j] = midNum;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}