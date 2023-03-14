public class c720VarParameterDetail {
    public static void main(String[] args) {
        /*
         * 这里我们谈谈可变参数的细节
         * 
         * 1.可变参数的实参可以为一个或者多个。
         * 2.可变参数的实参可以为数组
         * 3.可变参数的本质是数组
         * 4.可变参数可以和其他类型的参数一起放在形参列表
         * 5。一个形参列表只能出现一个可变参数
         * 
         */

         VPDetail vpDetail = new VPDetail();
         int[] arr = new int[]{1,2,3,4};
         vpDetail.test(1,2,3,4);
         vpDetail.test(arr);
        //  vpDetail.test();  报错，因为方法矛盾了
         vpDetail.test(1, "asdasd", "asdasdasd","dasdasdasdasdasd");

    }
}

class VPDetail{


    public void test (int... arr){
        System.out.println("test (int... arr)被调用");

    }

    public void test (int[]... arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("test (int[]... arr)被调用");

    }

    public void test (double n1, String str2, String... str1){

        System.out.println("test (double n1, String str2, String... str1)");
    }

    //public void test (double... arr2, String... str1)

    //这是错误的定义方式。
}
