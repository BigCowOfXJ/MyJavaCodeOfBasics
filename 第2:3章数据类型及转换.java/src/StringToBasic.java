public class StringToBasic {
    public static void main(String[] args){

        //String 是字符串类型
        //  任何类型转String 运用的是+ 的拼接

        int n = 2;
        long n2 = 4;
        float n3 = (float)3.1415926;  //这会出现小小的精度损失

        String m = "" + n; //“” 先后顺序无所谓
        String m2 = n2 + "";
        String m3 = n3 + "";

        System.out.println(m);
        System.out.println(m2);
        System.out.println(m3);

        //除了拼接，还有一个专门针对实数的类
        //这是 String 转化为 实数类
        //但是只针对数，其他不行
        String k1 = "1234";
        String k2 = "123.44";

        int a1 = Integer.parseInt(k1);
        //int a2 = Integer.parseInt(k2);   这会出现异常，这涉及类型转换，只能进行大转小，不能小转大
        
        float a3 = Float.parseFloat(k1);
        double a4 = Double.parseDouble(k2);

        //特殊的是short ，byte，boolean；
        //对于short ，byte还是要把控范围，避免不必要的异常；
        //这里只展示boolean
        boolean a5 = Boolean.parseBoolean("true");  //里面也可填false

        System.out.println(a1);
        //System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
    }
}
