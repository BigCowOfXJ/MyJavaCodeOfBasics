package LogicalOperator;

public class TernaryoperatorDetail {
    public static void main(String[] args){
        /*
         * 这里讲讲 三目运算符的细节
         * 这里会进行变量的自动转换，记得要赋给符合条件的变量 ，这就不举例了，提一提
         * 
         * 代码说明
         * 找出三个数中的最大值
         */
        int a = 10;
        int b = 30;
        int c = 77770;
        
        int maxNum = 0;
        maxNum = a > b ? a : b;
        maxNum = maxNum > c ? maxNum : c;
        //当然也可以加一个变量，进行二数交换

        System.out.println(maxNum);


    }
}
