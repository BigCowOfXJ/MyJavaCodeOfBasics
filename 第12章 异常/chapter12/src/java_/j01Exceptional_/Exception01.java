package java_.j01Exceptional_;

import java.io.FileInputStream;
import java.io.IOException;

@SuppressWarnings({"all"})
public class Exception01 {
    public static void main(String[] args) {
        //异常分为Eroor 和 Exception ，其实这两个是java的类

        //package java.lang;
        //public class Error extends Throwable {...}
        //public class Exception extends Throwable {...}

        //这两个类都位于 lang包，java自动加入包。


        //快捷建  command option/alt t
        try {
            FileInputStream fis;
            fis = new FileInputStream("d: (laa.jpg");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.println(len);
            }
        } catch (IOException e) {
            //因为这里抛出了新异常对象，JVM收到后会直接输出程序信息后中断程序。在此之前
            //会先执行finally 。这一注意顺序
            throw new RuntimeException(e);
        } finally {
            System.out.println("程序继续执行～～～～～～");
        }

        System.out.println("程序继续执行2～～～～～");  //这里并未输出

    }
}
