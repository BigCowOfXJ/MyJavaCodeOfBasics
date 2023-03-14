package LogicalOperator;

public class LogicOperator01 {
    public static void main(String[] args){
        /*
         * 这里讲的是与运算 与 或运算
         * 分为 短路与&& 与 逻辑与&
         * 两者之间是有区别的
         * 区别： 短路与（&&）前为假，后不执行。  逻辑与 不论什么情况，前后两都判断
         * 
         * 代码说明
         * 这里只展示区别，具体数学知识不再演示
         * 
         */
        int a = 10;
        int b = 20;
        if(a++ > 20 && b-- > 20 ){
            System.out.println("这条不会执行，前后条件为假");
        }
        System.out.println("a为 " + a + " , b为 " + b );

        if(a++ > 20 & b-- > 20 ){
            System.out.println("这条不会执行，前后条件为假");
        }
        System.out.println("a为 " + a + " , b为 " + b );

        if(a++ < 20 || b-- > 20 ){
            System.out.println("这条会执行,前条件为true");
        }
        System.out.println("a为 " + a + " , b为 " + b );

        if(a++ < 20 | b-- > 20 ){
            System.out.println("这条会执行，前条件为true");
        }
        System.out.println("a为 " + a + " , b为 " + b );
    }
}
