package LogicalOperator;

public class LogicOperator02 {
    public static void main(String[] args){
        /* 这里讨论的是异或与非运算
        * 
        * 没啥好讲的都是数学知识
        * 代码说明
        *没啥说明，复制运行看结果
        */
        System.out.println(60 > 20);
        System.out.println(!(60 > 20));

        System.out.println((60 > 20) ^ (60 < 20));
    }
}
