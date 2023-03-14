public class Break01 {
    public static void main(String[] args){
        /*现在实现随机数（1 - 100），直至输出97停止运行

        Math.random() 返回的是>=0 且 <1 的double
        1. while 循环
        2. for 循环
        */
        //1
        int number = 0;
        while(number != 97){
            number = (int)(Math.random() * 100) + 1;
            System.out.println(number);
        }

        //2
        System.out.println("==================");
        number = 0;
        int i = 0;
        for(; ; i++){
            number = (int) (Math.random() * 100) + 1;
            System.out.println(number + " .   " + i);
            if(number == 97)
                break;
        }
        
    }
}
