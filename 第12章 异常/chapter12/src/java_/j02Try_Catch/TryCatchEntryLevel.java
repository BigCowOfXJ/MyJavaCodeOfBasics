package java_.j02Try_Catch;

/**
 * 这里简单介绍一下 try-catch-finally 异常处理机制
 **/
@SuppressWarnings({"all"})
public class TryCatchEntryLevel {
    public static void main(String[] args) throws Exception{
        try {
            int num = 10;
            //下面会抛出 算术异常 ：ArithmeticException
            //出现异常后，try中对应语句后面的程序不会执行，太简单，就不演示了
            int num2 = num / 0;
            System.out.println("try 代码继续执行～～～～");

        }
        //这里的e接收try中产生的异常，所以try中的异常不会抛给JVM
        //若果没有异常抛出，catch语句不会执行
        catch (Exception e) {
            //public String getMessage() {
            //        return detailMessage;
            //    }
            System.out.println("异常信息为：" + e.getMessage());
        }
        //不论try会不会抛出异常，finally都会执行
        finally {
            System.out.println("finally is running~~~~~~~~~");
        }

        System.out.println("-------------------------");

        //try-finally 不要catch也可以
        //这里相当于没有捕获异常，只是在异常抛出前会执行finally
        //再把异常抛给JVM处理中断程序
        try{
        }finally{
        }

        //下面代码有点特殊，根据输出结果看
        //sout(额，getMessage())是在throw 前执行
        //finally也是在throw 前执行
        //但是sout是在finally前执行
        //而且throw后面这时不能跟任何语句
        //细节太多，就不深究了。。就研究到这
        try {
            throw new Exception("随便抛出的异常");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //因为这里的异常不是运行时异常，所以需要手动添加 throws Exception/对应异常类名
            //后面throw会强调这一点
            throw e;
        } finally {
            System.out.println("finally2 is running~~~~~~~~~");
        }
    }

}

