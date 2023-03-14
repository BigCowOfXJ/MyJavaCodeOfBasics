public class forceConvertDetail {
    public static void main(String[] args){

        //int x = (int) 3 / 2;   这做法是错的，强制转换针对最近的数据
        int x = (int) (3 / 2);
        System.out.println("x = " + x);

        //对char 赋值时，强制类型针对的是常量，变量需要强制转换
        int n1 = 97;
        char m = 97;
       // char m2 = n1    这是错误写法
       char m2 = (char) n1;
       System.out.println("m = " + m);
       System.out.println("m2 = " + m2);

       //byte 与 short 与 char 计算时，结果转为int，在进行赋值就看情况，这里就不多介绍


    }
}
