package java_.j01Exceptional_;

@SuppressWarnings({"all"})
public class RunExceIndexOut {
    public static void main(String[] args) {
        /*
        这里介绍 数组下标异常 ArrayIndexOutOfBoundsException
        public class ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException {}

         */
        int[] arr = new int[5];
        //这里arr虽然是局部变量，里面的元素虽然没定义，但编译器会自动赋值。(这里赋0)
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  " + i);
        }

        try {
            System.out.println(arr[i] + "   " + i);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            System.out.println("      这里报数组下标越界异常！！");
        }

        System.out.println("程序继续运行～～～～～～");
    }
}
