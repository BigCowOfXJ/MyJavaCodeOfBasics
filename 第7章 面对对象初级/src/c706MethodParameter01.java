public class c706MethodParameter01 {
    public static void main(String[] args) {
        /*
         * 传参机制（基本数据类型）
         * 
         * 
         */
        int a = 10;
        int b = 20;
        swap(a,b);

        System.out.printf("a = %d, b = %d\n", a, b);
    }

    public static void swap(int num1, int num2){
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.printf("a = %d, b = %d\n", num1, num2);
    }



}