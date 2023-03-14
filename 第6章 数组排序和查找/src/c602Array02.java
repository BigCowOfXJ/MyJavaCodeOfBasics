public class c602Array02 {

    public static void main(String[] args) {

        int[] arr1 = new int[6];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        int[] arr6 = null;
        System.out.println(arr6);
        System.out.println("dfdasdasdasd");

        // int[] arr7 = new int[3];
        // arr7 = {1, 2, 3};
        // 上面的定义是错的，要想直接赋值。只有以下两种

        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = new int[] { 1, 2, 3 };
        // int[] arr5 = new int[3] { 1, 2, 3 };  这也是错误的
    }
}
