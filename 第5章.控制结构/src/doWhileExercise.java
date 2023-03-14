import java.util.Scanner;

public class doWhileExercise {
    public static void main(String[] args) {
        // 把张三欠的钱要回

        Scanner myScanner = new Scanner(System.in);
        char judge;
        do {
            judge = myScanner.next().charAt(0);
            while (judge != 'y' && judge != 'n') {
                System.out.printf("输入有问题，请重新输入\n");
                judge = myScanner.next().charAt(0);
            }

            if (judge == 'y') {
                System.out.printf("不打张三了，因为他把钱还了\n");
            } else {

                System.out.printf("我直接就是三连鞭，把他大残\n");
            }

        } while (judge == 'n');

    }
}
