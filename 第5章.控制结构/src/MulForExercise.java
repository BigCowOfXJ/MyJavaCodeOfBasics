public class MulForExercise {
    public static void main(String[] args){
    //打印九九乘法表

    int i = 1;
    int n = 0;
    for(; i <= 9; i++){
        for(n = 1; n <= i ; n++){
            if(n * i <= 9){
                System.out.printf("%d * %d = %d   ", n , i , n * i);
            }
            else{
                System.out.printf("%d * %d = %d  ", n , i , n * i);
            }

        }
        System.out.printf("\n");

    }



    }
}
