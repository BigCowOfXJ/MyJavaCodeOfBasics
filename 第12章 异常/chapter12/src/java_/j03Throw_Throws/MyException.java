package java_.j03Throw_Throws;

@SuppressWarnings({"all"})
public class MyException {
    public static void main(String[] args) throws Throwable{

        MyExceptionOfRunTime my = new MyExceptionOfRunTime("asdsad");
        System.out.println(my);

        //类Throwable
        //public String getMessage() {
        //        return detailMessage;
        //    }
        System.out.println(my.getMessage());

        //因为这里是运行时异常，所以与编译器默认加的RunTimeException 对应起来。所以没报错
        //throw my;

        //下面报错，因为MyExceptionOfRunTime2继承的是Exception，是RunTimeException的父类
        //所以这里没有 throws抛出的类与MyExceptionOfRunTime2对应。
        //所以需要 throws Exception/MyExceptionOfRunTime2/Throwale(Exception的父类)
        throw new MyExceptionOfRunTime2("ASdasdasdasd");

    }
}

@SuppressWarnings({"all"})
class MyExceptionOfRunTime extends RuntimeException{
    //public RuntimeException(String message) {
    //        super(message);
    //    }
    //追到类Throwable
    //public Throwable(String message) {
    //        fillInStackTrace();
    //        detailMessage = message;
    //    }
    //private String detailMessage;
    public MyExceptionOfRunTime(String message) {
        super(message);
    }
}
@SuppressWarnings({"all"})
class MyExceptionOfRunTime2 extends Exception{
    public MyExceptionOfRunTime2(String message) {
        super(message);
    }
}
