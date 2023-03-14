import java.util.Scanner;
public class whileExercise {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        //输出 0 —— i 之间三的倍数
        int i = myScanner.nextInt();
        for(int n = 0; n < i ; n ++){
            if(n % 3 == 0){
                System.out.printf("%d是三的倍数\n" , n);
            }
 


        }
        int n = -1;
        System.out.printf("%d这不是局部变量的n ，与上述n不一样" , n);
    }
}
