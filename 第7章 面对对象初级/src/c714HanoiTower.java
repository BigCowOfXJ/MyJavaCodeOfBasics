public class c714HanoiTower {
    public static void main(String[] args) {
        /*
         * 这里我们谈一谈汉诺塔递归
         * 
         * 
         */

         Tower tower = new Tower();

         tower.Operation01(9, 'a', 'b', 'c');
        System.out.println("移动次数 = " + Tower.count);
    }
}

class Tower {
    static int count ;

    public void Operation01(int num, char t1, char t2, char t3) {

        if (num == 1) {
            System.out.println(t1 + " -> " + t3);
            count ++;
            return;
        } else {

            Operation01(num - 1, t1, t3, t2);
            System.out.println(t1 + " -> " + t3);
            count ++;
            Operation01(num - 1, t2, t1, t3);
            
        }
    }
}