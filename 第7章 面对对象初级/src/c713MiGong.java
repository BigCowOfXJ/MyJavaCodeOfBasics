public class c713MiGong {
    public static void main(String[] args) {

        /*
         * 1. 开始时用二维数组表示迷宫
         * 2. 暂时 用-1：表示障碍物，0：表示没障碍暂时可以走的路
         * 
         */
        int[][] arr = new int[9][9];
        MiGongOperation miGongOperation = new MiGongOperation();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0) {
                    arr[i][j] = -1;
                } else if (i == arr.length - 1) {
                    arr[i][j] = -1;
                } else {
                    arr[i][0] = -1;
                    arr[i][arr[i].length - 1] = -1;
                }
            }
        }
        System.out.println("=========打印迷宫=======");
        miGongOperation.PrintMiGong(arr);
        System.out.println("================");
        // 3. 在这里设置路障 这里用9表示路障

        arr[4][1] = 9;
        arr[4][2] = 9;
        // arr[6][7] = 9;
        arr[7][6] = 9;
        arr[7][7] = 9;
        System.out.println("=========设置路障后的迷宫=======");
        miGongOperation.PrintMiGong(arr);
        System.out.println("================");

        // 接下来就是寻找在迷宫中出路

        // 0 表示没走过但可以走的路， -1 表示墙， 2 表示走过但还是未知的路， 3 表示走过但走不通的路 , 4 表示初始位置。

        // num1 ,num2 表示初始位置
        int num1 = 3;
        int num2 = 1;

        
        boolean judge = miGongOperation.Operation01(num1, num2, arr);
        arr[num1][num2] = 4;

        miGongOperation.PrintMiGong(arr);

        System.out.println("====================");
        if (judge == true) {
            System.out.println("恭喜，找到路径");
        } else {
            System.out.println("无出路");
        }

    }
}

class MiGongOperation {

    // 迷宫出路操作
    /*
     * 1 总所周知，迷宫嘛都是不断尝试的。（前提是不知道迷宫的布局）
     * 2 所以找出路有一定运气因素，就像抽奖一样。不断尝试
     * 3 运气好，闯一遍就通关，运气不好，所有路都得找一遍才能找出
     * 4 有些迷宫更刁钻，全图只有唯一一条出路。
     * 
     * 所以本人认为
     * 
     * 0 表示没走过但可以走的路， -1 表示路障， 2 表示走过但还是未知的路(以及成功的路也用2表示)， 3 表示走过但走不通的路 , 4 表示初始位置。
     * 有四种寻路方案，但是毕竟是程序，我们只能选一种
     * 寻路方案：上左下右，左下右上，下右上左，有上左下
     * 
     */

    // num1 表示行，num2 表示 列
    public boolean Operation01(int num1, int num2, int[][] arr) {

        if (arr[num1][num2] != 0) {
            return false;
        } else {

            arr[num1][num2] = 2;

            // 设置终点，但终点不能让用户知道
            if (arr[7][7] == 2) {
                return true;
            }

            if (Operation01(num1 + 1, num2, arr)) {
                return true;
            } else if (Operation01(num1, num2 + 1, arr)) {
                return true;
            } else if (Operation01(num1 - 1, num2, arr)) {
                return true;
            } else if (Operation01(num1, num2 - 1, arr)) {
                return true;
            } else {
                arr[num1][num2] = 3;
                return false;
            }
        }

    }

    public void PrintMiGong(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
