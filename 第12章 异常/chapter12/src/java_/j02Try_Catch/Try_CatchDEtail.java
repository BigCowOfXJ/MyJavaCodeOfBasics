package java_.j02Try_Catch;

/**
 * 这里介绍 try-catch细节
 */
@SuppressWarnings({"all"})
public class Try_CatchDEtail {
    public static void main(String[] args) {

        //这里没有finally，编译器给通过
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            try {
                throw e;
            } catch (NullPointerException ex) {
                System.out.println("异常我就不给JVM～～～～～～～");
                ;
            } finally {
                System.out.println("finally is running ～～～～～～～～");
            }
        }

        //catch可以有多个。
        //父类型异常必须位于子类型异常的下面。也就是子上父下

        //下面可见如果对赢的抛出的异常没有捕获异常，就相当于try-finally执行机制
        //先输出finally里的内容，在抛出异常中断程序
        //这里提前说一下，抛出的异常如果是编译异常，则需要手动在对应的方法参数列表后添加上throws 对应异常
        //或者直接 throws Exception
        try {
            int[] arr = null;
            System.out.println(arr[0]);
        } catch (ClassCastException e) {
            System.out.println("ClassCast 捕获～～～～～～");
        } catch (ArithmeticException e) {
            System.out.println("Arith 捕获～～～～～～");
        } finally {
            System.out.println("这里的异常没有对应捕获");
        }
        //catch(Exception e){}
        // 下面报错，没有遵循子上父下的原则
        //catch(NumberFormatException e){}

        System.out.println("程序继续执行～～～～～～～");
    }
}
