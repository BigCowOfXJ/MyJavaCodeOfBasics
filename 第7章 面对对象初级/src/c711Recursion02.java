public class c711Recursion02 {
    public static void main(String[] args) {
        /*
         * 简单递归练习题
         * 1. 阶乘
         * 2.斐波那契数列
         * 
         * 
         */

        // 1

        Operation03 operation03 = new Operation03();

        int sum = operation03.Factorial(4);

        System.out.println(sum);

        System.out.println(operation03.Fibonacci(7));




    }
}

class Operation03 {
    public int Factorial(int num) {

        if(num == 1){
            return 1;

        }
        return num * Factorial(num - 1);
    }

    public int Fibonacci(int num){
        if(num == 1 || num ==2){
            return 1;
        }

        return Fibonacci(num - 2) + Fibonacci(num - 1);



    }
}
