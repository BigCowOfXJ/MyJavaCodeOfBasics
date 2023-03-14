package java_.j01Exceptional_;

@SuppressWarnings({"all"})
public class RunExceArithmeticException {
    public static void main(String[] args) {

        //这里极少2 算术运算异常
        //ArithmeticException
        //public class ArithmeticException extends RuntimeException {...}

        int num = 12;

        try {
            System.out.println(num / 0);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            System.out.println("这里出现算术异常，也就是除0异常");
        }
    }
}
