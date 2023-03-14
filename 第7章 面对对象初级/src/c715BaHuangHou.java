public class c715BaHuangHou {

    
    public static void main(String[] args) {
        /*
         * 本章说说八皇后的问题
         * 
         * 要求：列出所有的情况
         */

        BaaHuang baaHuang = new BaaHuang();

        int[] arr = new int[8];
        baaHuang.Operation01(0, arr);
        System.out.println(baaHuang.count);
        System.out.println("sdsdsds");
    }
}

class BaaHuang {
    int count = 0;
    public void Operation01(int row, int[] arr) {

        int judge = 1;
        for (int i = 0; i < arr.length; i++) {
            judge = 1;
            arr[row] = i;
            if (row == 0) {
                Operation01(row + 1, arr);
            } else {
                int k = row - 1;
                for (int j = 1; j <= row; j++, k--) {
                    if (i == arr[k]) {
                        judge = 0;
                        break;
                    } else if (arr[k] == i - j || arr[k] == i + j) {
                        judge = 0;
                        break;
                    }
                }
                if (judge == 1 && row != 7) {
                    Operation01(row + 1, arr);
                }
                if (row == 7 && judge == 1) {
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[j] + 1 + " ");
                    }
                    this.count++;
                    System.out.println("\n===================");
                }
            }

        }
    }
}
