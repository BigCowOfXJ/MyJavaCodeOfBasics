public class ArithmeticOperator {
    public static void main(String[] args) throws Exception {
        
        //这里主要是% 以及 ++ 的本质原理。（-- 类似于 ++）


        // % 的本质 ： a % b = a - a / b * b；
       
        //10 % 3 = 10 - 10 / 3 * 3；
        System.out.println(10 % 3);   //1
        //-10 % 3 = -10 - -10 / 3 * 3；
        System.out.println(-10 % 3);  //-1
        //10 % -3 = 10 - 10 / -3 * -3；
        System.out.println(10 % -3);  //1
        //-10 % -3 = -10 - -10 / -3 * -3；
        System.out.println(-10 % -3);  //-1


        System.out.println("=============================");

        //介绍++ （--类似）
        //基本的操作略，i++先赋值后++，++i先++后赋值
        //这里介绍++的本质原理
        // j=i++ -》 temp = i 》 i += 1 》 j = temp   （--类似）
        // j=++i -》 i += 1 》 temp = i 》 j = temp    （--类似）
        int i = 3;
        i = i ++;
        System.out.println(i);  //3
        i = ++i;
        System.out.println(i);  //4

        i = i --;
        System.out.println(i);  //4
        i = --i;
        System.out.println(i);  //3
    }
}
