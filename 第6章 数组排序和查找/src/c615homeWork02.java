public class c615homeWork02 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("===========");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("平均数 = " + sum / arr.length);

        int MaxNum = 0;
        int indexes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MaxNum) {
                MaxNum = arr[i];
                indexes = i;
            }
        }

        System.out.println("最大值为 = " + MaxNum + " 下标为 = " + (indexes + 1));
    }
}
