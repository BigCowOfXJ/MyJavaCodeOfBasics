public class c605ArrayCopy {
    public static void main(String[] args) {
        // 数组拷贝
        // 要求是要独立的空间

        double[] arr = { 1, 2, 3, 4, 5 };

        double[] arr2 = CopyOperation(arr);
        if(arr2 != null){
            System.out.println(arr2 +"\t" +arr);
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]);
            }
        }else{
            System.out.println("error");
        }
    }

    public static double[] CopyOperation(double[] arr) {
        double[] arr2 = new double[arr.length];

        if (arr.length > 0 && arr != null) {
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            return arr2;
        }else{
            return null;
        }
    }
}
