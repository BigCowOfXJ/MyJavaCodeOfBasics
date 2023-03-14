public class c705Methodexercise01 {
    public static void main(String[] args) {
        /*
         * 这里来小试牛刀
         * 
         * 方法1:判断奇偶性
         * 方法2:根据输入的行列，打印字符
         * 
         * 这里只是简单描述题目，具体的在讲义里
         */

        Operation operation = new Operation();

        
        System.out.println(operation.JiOuXing(12));
        operation.Tu(4,5, '*');
    }
}

class Operation {

    public boolean JiOuXing(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void Tu(int cow, int col, char c) {
        for (int i = 0; i < cow; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("c ");
            }
            System.out.println();
        }
    }
}