package java_.j03Throw_Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 这里简单的介绍一下 throw 和 throws
 *
 * */

@SuppressWarnings({"all"})
public class ThrowEntryLevel {
    public static void main(String[] args) {

        try {
            throwShow();
        } catch (Exception e) {
            System.out.println("异常星系为：" + e.getMessage());
        } finally {
        }
        System.out.println("---------------------");
        try {
            throwShow2();
        } catch (Exception e) {
            System.out.println("异常星系为：" + e.getMessage());
        } finally {
        }
        System.out.println("---------------------");
        try {
            throwShow3();
        } catch (Exception e) {
            System.out.println("异常星系为：" + e.getMessage());
        } finally {
        }
        System.out.println("---------------------");

        try {
            throwShow4();
        } catch (Exception e) {
            System.out.println("异常星系为：" + e.getMessage());
        } finally {
        }
    }
    public static void throwShow () throws Exception ,NullPointerException{  //throws 后面接的是类，throw后面接的是对象

        throw new Exception("throwShow方法 抛出异常～～～～～～～～～");
        //下面报错，也就是在抛出异常后，若该方法没有应对措施。
        //代码下面的一切都不执行
        //System.out.println("程序继续执行");
    }

    public static void throwShow2 () throws Exception ,NullPointerException{  //throws 后面接的是类，throw后面接的是对象

        try {
            throw new Exception("throwShow2方法 抛出异常～～～～～～～～～");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            System.out.println("throwShow2 is running ~~~~~~~~~~");
        }

        //这里报错，同样的是给调用者抛出异常后（异常是new的）。后面不准写代码，而且写了也没意义。(报错)
        //System.out.println("throwShow2 is running~~~~~~~~~~");
    }

    public static void throwShow3 () throws Exception,NullPointerException{  //throws 后面接的是类，throw后面接的是对象


        try {
            FileInputStream file = new FileInputStream("d://aa. txt");
        } catch (Exception e) {
            throw e;  //编译异常，编译器不会自动抛出，编译器会自动加上RunTimeException，所以这里需要手动添加异常
        }finally{
            System.out.println("throwShow3 is running ~~~~~~~~~~");
        }

        //这里并没有报编译错误
        //  FileInputStream 语句报的是编译错误
        //虽然这是编译错误，但是也不是100%会发生，如果星灿里的文件存在，就可以避免异常
        //当然了，如果产生异常，执行流程与上面的throwShow2一样。
        System.out.println("throwShow3 is running～～～～～～～～");
    }

    //throws 后面接的是类，throw后面接的是对象,这里的File...Exception是编译异常
    //但是他不像构造器一样。
    /*
    构造器没定义时，编译器会自动加上一个无参构造器
    但是当用户自己定义了构造器时，编译器就会取消自动加入无参构造器
    这里的throws虽然跑出了一个编译异常，但是依然不影响编译器自动加上RunTimeException

     */
    public static void throwShow4 () throws FileNotFoundException,NullPointerException {

        try {
            int num = 2 / 0;
        } catch (Exception e) {
            throw e;
        }finally{
            System.out.println("throwShow4 is running ~~~~~~~~~~");
        }

        //这里并没有报编译错误
        //因为try中的异常是可能会抛出的(运行时异常)，它不是100%概率产生的异常
        //当然了，如果产生异常，执行流程与上面的throwShow2一样。
        System.out.println("throwShow444444 is running～～～～～～～～");
    }
}
