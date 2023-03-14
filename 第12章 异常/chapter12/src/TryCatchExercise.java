import java.util.Scanner;

@SuppressWarnings({"all"})
public class TryCatchExercise {
    public static void main(String[] args) {
        /*
        * 如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止
        * */
        Scanner scan = new Scanner(System.in);
        boolean judge = true;
        while (judge) {
            String num = scan.next();
            try{
                int num2 = Integer.parseInt(num);
                judge = false;
                System.out.println(num2);
            }catch(Exception e){
                System.out.print("您的输入有错误，请输入整数：");
            }
        }

    }
}