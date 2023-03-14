public class c712RecursionExercise {
    public static void main(String[] args) {
        /*
         * 这里谈论一下猴子吃桃的问题
         * 
         * 
         */

        for (int i = 9; i >= 1; i--) {
            System.out.println(peach(i));
        }
        System.out.println("================~");
        for (int i = 9; i >= 1; i--) {
            System.out.println(peach(i));
        }
    }

    // 递归调用
    public static int peach(int day) {

        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;

        } else {
            System.out.println("输入错误");
            return -1;
        }
    }

    // 不用递归的方法
    public static int peach02(int day) {

        int num = 1;
        if (day >= 1 && day <= 9) {
            for (int i = 0; i < (10 - day); i++) {
                num = (num + 1) * 2;
            }

            return num;
        }else{
            System.out.println("你的输入有误");
            return -1;
        }
    }

}
