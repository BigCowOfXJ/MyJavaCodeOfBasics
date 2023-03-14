package java_.j03Throw_Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 这里聊一聊 Throws的细节
 *
 * **/
@SuppressWarnings({"all"})
public class ThrowsDeatil {
    public static void main(String[] args) throws FileNotFoundException {

        //detail01 虽然会抛出异常，但是该方法后会 加上 RunTimeException
        //detail01 ： 运行时异常可以不用处理，因为有throws 机制
        detail01();

        //detail02
        //一样的，detail抛出的编译异常 无法与默认处理机制的RunTimeException匹配
        //所以要么 try-catch 要么 throws
        detail02();

        System.out.println("程序继 detail02 继续执行～～～～～～～～～");
        //detail03 在下面的 Son 和 Father 演示

    }

    public static void detail01() {

        //下面的是运行时异常
        //运行时异常程序员可以自己不用处理
        //因为编译器 会在 对应的方法星灿列表后 加上 throws RunTimeException
        int n1 = 12;
        int n2 = 0;
        System.out.println(n1 / n2);

        System.out.println("detail01() 程序正在执行～～～～～～～");
    }

    public static void detail02() throws FileNotFoundException {

        //下面属于编译异常
        //因为 自动加入的是 RunTimeException ，所以编译异常并不会与之匹配。
        //自然就会报错。
        //解决方案有两种
        /*
         * 1 ： try-catch-finally 处理机制,
         * 2：  抛出对应的编译异常
         *      这里就只演示 throws 解决方案了
         * */
        FileInputStream file = new FileInputStream("asdadasd");
        System.out.println("detail01() 程序正在执行～～～～～～～");
    }
}

@SuppressWarnings({"all"})
class Father {
    public static void main() {
        Father fat = new Son();
    }

    public void father() throws RuntimeException {
    }

    public void father2() throws FileNotFoundException {
    }

    public void father3() throws NullPointerException {
    }
}

@SuppressWarnings({"all"})
class Son extends Father {
    //@Override
    //下面报错
    //因为FileNotFoundException 与 RuntimeException 不构成父子关系
    //public void father() throws FileNotFoundException{}

    @Override
    public void father() throws NullPointerException {
    }

    //@Override
    //这里报错 ，因为ClassNotFoundException 与 FileNotFoundException 不构成父子关系
    //这里是编译错误， 无法与 RunTimeException 匹配
    //public void father2() throws ClassNotFoundException{}
    @Override
    public void father2() throws FileNotFoundException {
    }

    //
    @Override
    //这里报错，因为Exception 是 NullPointerException的父类 ，这里本末倒置
    //public void father3() throws Exception {}
    //这里没报错
    //父类的public void father3() throws NullPointerException {}
    //    等价于 public void father3() throws NullPointerException,RunTimeException {}
    //   ClassCastException 虽然没与 NullPointerException 匹配，但是与RunTimeException匹配
    public void father3() throws ClassCastException {}
}
