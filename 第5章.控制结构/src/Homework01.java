public class Homework01 {
    public static void main(String[] args) {

        // 题目 ：文件里有，这里不再介绍。后面章节的题目也一样。

        double money = 100000;
        int count = 0;
        while (money >= 1000) {
            if (money > 50000) {
                money -= (money * 0.05);
            } else {
                money -= 1000;
            }
            count++;
        }
        System.out.println(count + "\n" + money);
    }
}