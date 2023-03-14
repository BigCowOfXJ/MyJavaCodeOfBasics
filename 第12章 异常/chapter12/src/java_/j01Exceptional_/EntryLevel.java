package java_.j01Exceptional_;


@SuppressWarnings({"all"})
public class EntryLevel {
    //这里简单的入一下异常的门，简单了解。
    public static void main(String[] args) {

        int num = 1;

        //下面出现异常，其类型为运行时异常
        //除数不能为0，抛出异常类java.lang.ArithmeticException
        //这里因为是运行时异常，所以编译器不会报错
        //这里的异常抛给了JVM处理，JVM直接抛出异常类终止了该程序

        //可以让程序员自己处理，这里就不会把异常抛给JVM
        //所以下面的sout语句就会继续执行

        //这里可以使用快捷键ctrl +alt+t
        try {
            System.out.println(num / 0);
        } catch (Exception e) {
            //    public String getMessage() {
            //        return detailMessage;
            //    }
            System.out.println(e.getMessage());   /// by zero
        } finally {
            System.out.println("finally 的语句会继续执行1～～～～～～～～");
        }
        System.out.println("异常后的程序～～～～～～");
    }
}
