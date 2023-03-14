package java_.j01Exceptional_;

@SuppressWarnings({"all"})
public class FiveRunTimeExceptionOfNull {
    public static void main(String[] args) {
        //异常类 Exception 有两个子类
        //一类统称为 必检异常(编译异常)  和  受检异常(运行异常)

        /*
        这里主要介绍 五大运行时异常(都位于lang包)
        1 空指针异常  NullPointerException
        2 算术异常
        3 数组下标越界异常
        4 类转换异常
        5 数据形式不对(下面举例关于String -》 对应基本类型)
        */

        //1 空指针异常
        //public class NullPointerException extends RuntimeException {...}
        String name = "1234";
        String name2 = "true";
        String name3 = null;
        //public static int parseInt(String s) throws NumberFormatException {
        //        return parseInt(s,10);
        //    }
        int num = Integer.parseInt(name);
        System.out.println("name = " + name);
        //public static boolean parseBoolean(String s) {
        //        return ((s != null) && s.equalsIgnoreCase("true"));
        //    }
        boolean judge = Boolean.parseBoolean(name2);
        System.out.println("judge = " + judge);
        try {
            num = Integer.parseInt(name3);  //这里是会报错的
        } catch (Exception e) {
            System.out.print(e.getMessage());
            System.out.println("     这里报空指针异常");
        }

    }
}
