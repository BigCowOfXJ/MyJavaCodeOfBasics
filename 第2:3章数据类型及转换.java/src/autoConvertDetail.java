public class autoConvertDetail {
    public static void main(String[] args){
       //    不多说，直接总结
       //    小转大，混合运算精度为最大的数据类型
       //    short，byte与char 不进行类型转化，但可以运算，精度转为int

       //    byte，short 赋值问题
        byte n = 120;
     //  byte n2 = 200;    
        short n2 = 120;
        char n3 = 97;

     //   byte n4 = n + n2 + n3;    这里报错，int-》byte
        int n4 = n + n2 + n3;
        float n5 = n + n2 + n3;

      //这里还是注意一些不为认知的细节，经常被忽略
      //  这是从左往右的顺序
      double n6 = 10 / 4 * 4;
      double n7 = 10 / 4 * 4.0;
      double n8 = 10 / 4.0 * 4;
      double n9 = 4 * 10 / 80;
      double n10 = 4 * 10 / 80.0;
      System.out.println("n6 = " + n6);
      System.out.println("n7 = " + n7);
      System.out.println("n8 = " + n8);
      System.out.println("n9 = " + n9);
      System.out.println("n10 = " + n10);
    }
}
