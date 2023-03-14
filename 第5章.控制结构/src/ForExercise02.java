import java.util.Scanner;
public class ForExercise02 {
    public static void main(String[] args){
        //实现以下图案
        /* 要求 先死后活，化繁为简
         * *
         * **
         * ***
         * ****
         * *****
         */
        Scanner myScanner = new Scanner(System.in);
        int num1 = myScanner.nextInt();
        int n = 0;
        int i = 0;
        for(n = 0; n < num1; n++){
            for(i = 0; i <= n; i++){
                System.out.printf("*");
            }
            System.out.printf("\n");

        

        }
        //  改进
        /*
         * 输出以下图案
         *     *
         *    ***
         *   *****
         *  *******
         *  同样· 先死后活，化繁为简
         * 
         * 
         */
        int num2 = myScanner.nextInt();
        int j = 0;
        for(n = 1 ; n <= num2 ; n++){
            for(j = 1; j <= num2 - n ; j++){
                System.out.printf(" ");
            }
            for(i = 1 ; i <= 2 * n - 1 ; i++){
                System.out.printf("*");
            }
            System.out.println();
        }
        //  改进
        /*
         * 输出以下图案
         *     *
         *    * *
         *   *   *
         *  *******
         *  同样· 先死后活，化繁为简
         * 
         * 
         */
        int num3 = myScanner.nextInt();
        for(n = 1 ; n <= num3 ; n ++){
            for(j = 0 ; j < num3 - n ; j++){
                System.out.printf(" ");
            }

            for(i = 1 ; i <= 2 * n - 1 ; i ++){
                if(n == num3){
                    System.out.printf("*");
                }
                else if(i == 1 || i == (2 * n - 1) ){
                    System.out.printf("*");
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.println();


        }

    }
}
