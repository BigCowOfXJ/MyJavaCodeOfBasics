package java_.j04Exercise_;

import java.util.Scanner;

@SuppressWarnings({"all"})
public class Excecise01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String[] arr = new String[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }

        cal(arr);


    }

    public static void cal(String[] arr) {
        try {
            if (arr.length > 2) {
                throw new ArrayIndexOutOfBoundsException("你的数组下标超出了范围");
            }
            Double num1 = Double.parseDouble(arr[0]);
            Double num2 = Double.parseDouble(arr[1]);

            Double res = num1 / num2;
            System.out.println("res = " + res);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("你输入的格式不对");
        } catch (ArithmeticException e) {
            System.out.println("你输入的格式不对");
        } finally {

        }
    }
}
