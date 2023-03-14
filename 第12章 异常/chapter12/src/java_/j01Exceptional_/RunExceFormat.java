package java_.j01Exceptional_;

@SuppressWarnings({"all"})
public class RunExceFormat {
    public static void main(String[] args) {
        /*
        NumberFormatException数字格式不正确异常
        当应用程序试因将字符串转换成一种数值类型，但该字符串不能转换为适
        当格式时，抛出该异常 二＞使用异常我们可以确保输入是满足条件数字.
         */

        String num1 = "123";
        String name = "mary";

        int num2 = Integer.parseInt(num1);

        try{
            num2 = Integer.parseInt(name);
        }catch(Exception e){
            System.out.print(e.getMessage());
            System.out.println("       这里报NumberFormatException");
        }

    }
}
