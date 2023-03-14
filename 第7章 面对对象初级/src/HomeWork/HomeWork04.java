package HomeWork;

public class HomeWork04 {
    public static void main(String[] args) {
        /*
         * 
         * 输入一个旧数组，返回一个新数组，要求新数组元素与旧数组元素一致
         */

         int[] arr = {1,2,3,4,5,6,9};
        double[] arr2 = {2,32,12,56,78};

        Operation04 operation04 = new Operation04();

        int[] arr3 = operation04.CopyArr(arr);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
        System.out.println();

        Double[] arr4 = operation04.CopyArr(arr2);

        if(arr4 == null){
            System.out.println("数组错误");
        }else{
            for (int i = 0; i < arr4.length; i++) {
                System.out.print(arr4[i] + "\t");
            }
            System.out.println();
        }

        arr2 = null;
        arr4 = operation04.CopyArr(arr2);

        if(arr4 == null){
            System.out.println("数组错误");
        }else{
            for (int i = 0; i < arr4.length; i++) {
                System.out.print(arr4[i] + "\t");
            }
            System.out.println();

            
        }
    }
}

class Operation04{

    public int[] CopyArr(int[] arr){

        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }

        return arr2;
    }   
    public Double[] CopyArr(double[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }

        Double[] arr2 = new Double[arr.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }

        return arr2;
    }

}
