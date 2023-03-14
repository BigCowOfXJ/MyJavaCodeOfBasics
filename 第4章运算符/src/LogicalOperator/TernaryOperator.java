package LogicalOperator;

public class TernaryOperator {
    public static void main(String[] args){

        /*
         * 
         * 这里讲讲三目运算符
         * 
         * 条件表达式 ？ 表达式1 ： 表达式2
         * 一真大师 ，真执行表达式1，假执行表达式2
         */

         int a = 10;
         int b = 20;
         int result = a > b ? a++ : b--;

         System.out.println("" + a + " " + b + " " + result);
    }
}
