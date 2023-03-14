public class ForDetail {
    public static void main(String[] args) {

        int i;
        int j;

        for (i = 0; i < 100; i++) {
            System.out.printf("i is %d\n", i);
        }

        i = 0;
        for (; i < 100;) {
            System.out.printf("i is %d\n", i);
            i++;
        }

        // 以下是死循环
        // for(; ; ){

        // }

    }
}
