public class c609ArrayResarch {

    public static void main(String[] args) {
        // 顺序查找 略。。。。。。。

        // 二分查找
        int[] arr = { 12, 21, 23, 32, 45, 54 };
        int researchNum = 21;
        Integer i = BinarySearch(arr, researchNum);
        if (i != null) {
            System.out.println(arr[i]);
        } else {
            System.out.println("无此元素");
        }
    }

    public static Integer BinarySearch(int[] arr, int num) {

        int right = arr.length - 1;
        int left = 0;
        int midNum = (right + left) / 2;

        while (right >= left) {
            if (arr[midNum] == num) {
                return midNum;
            } else if (arr[midNum] > num) {
                right = midNum - 1;
                midNum = (right + left) / 2;
            } else {
                left = midNum + 1;
                midNum = (right + left) / 2;
            }
        }
        return null;
    }
}