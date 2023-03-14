import java.util.Scanner;
public class switch01 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        char a = myScanner.next().charAt(0);




        /*
         * switch 使用细节：
         * 1.这里的a 要与 case 的常量相符
         * 2.switch（表达式） 表达式必须是byte short int char enum String （不能是 long float double）
         * 3.break 要注意是否需要，不然会执行下面的
         * 4。defalut 可有可无 根据自己需求写
         * 
         * 
         * 
         * 
         */

        switch(a){
            case 'a':
                System.out.println("星期一   ");
                break;
            case 'b':
                System.out.println("星期二   ");
                break;
            case 'c':
                System.out.println("星期三以及其他 。。。。");
                break;
            default :
                System.out.println("输入有误");

        }



    }
}
