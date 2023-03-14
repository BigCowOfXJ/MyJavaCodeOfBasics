import java.util.Scanner;

public class if01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int old = input.nextInt();

        if (old >= 18) {
            System.out.println("你已经成年");
        } else {

            System.out.printf("未满18，小屁孩");
        }
    }
}
