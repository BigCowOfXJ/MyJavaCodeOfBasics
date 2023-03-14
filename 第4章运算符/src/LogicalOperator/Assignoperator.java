package LogicalOperator;

public class Assignoperator {
    public static void main(String[] args){
        /*
         * 这里讲讲赋值运算符
         * 有+= -= /= *= %= 等
         * 
         * 对于byte 和 short 会进行自动转换
         * 对于char 也会， 但是正常的双目 要进行强转
         * 
         * 代码说明
         * 没啥说明的，全是基本语法和数学知识
         */
        int a = 7;
        a += 3;
        System.out.println(a);

        byte b = 7;
        b += 3; //等价于 b = (byte)(b + 3);  short 与 byte 类似
        System.out.println(b);

        char c = 'a';
        c += 1; //等价于 c = (cahr)(c + 1);
        System.out.println(c);
        // c = c + 1;  //报错要进行强转
        // System.out.println(c);





    }
}
