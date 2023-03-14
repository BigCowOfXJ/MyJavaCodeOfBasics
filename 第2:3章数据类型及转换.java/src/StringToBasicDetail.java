public class StringToBasicDetail {
    public static void main(String[] args){
        //这里探讨的是String 转其他类型是有限制的
        //乱用会出现异常,编译能过，但运行会出错
        String n1 = "123";
        String n2 = "hello";

        int m1 = Integer.parseInt(n1);
        float m2 = Float.parseFloat(n1);
        int m3 = Integer.parseInt(n2);

        //查看运行结果就知道了


    }
}
