package HomeWork;

public class HomeWork01 {
    public static void main(String[] args) {
        /*
         * 求double数组的最大值
         * 
         */

         double[] arr = {1,32,-1,23,41};
        Operation01 operation01 = new Operation01();
        System.out.println(operation01.Max(arr));
        
    }
}

class Operation01{
    public double Max(double[] arr){
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
