public class Homework05 {
    // 打印字母表
    public static void main(String[] args) {
        char a = 'a';
        int i = 0;
        for (; a <= 'z'; a++) {
            System.out.print(a + "\t");
            i++;
            if (i == 5) {
                i = 0;
                System.out.println();
            }
        }
        System.out.println("\n================\n");
        a = 'A';
        for (; a <= 'Z'; a++) {
            System.out.print(a + "\t");
            i++;
            if (i == 5) {
                i = 0;
                System.out.println();
            }
        }
    }
}
