public class c716OverLoad01 {
    public static void main(String[] args) {
        /*
         * 这里我们讲讲方法重载
         * 
         * 有很多优势，重载减轻了方法的记名起名的麻烦
         * 
         * 下面是小试牛刀
         */
        Over01 over01 = new Over01();

        System.out.println(over01.sum(12, 13.0));
        System.out.println(over01.sum(12, 13));
        System.out.println(over01.sum(12, 12, 013));
        over01.sum(12, 12, 013,13);
    }
}

class Over01{
    public double sum(int n1, int n2){
        return n1 + n2;
    }
    public double sum(int n1, double n4){
        return n1 + n4;
    }
    public int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public void sum(int n1, int n2, int n3, int n4){
        System.out.println("sum = " + (n1 + n2 + n3 + n4));
    }
    


}