public class bitOperation {
    public static void main(String[] args){

        System.out.println(1 >> 2);
        System.out.println(-1 >> 2);    // 前补符号位
        System.out.println(1 << 2);
        System.out.println(-1 << 2);
        System.out.println(-1 >>> 2);   //三个表示算术右移，前补0

        System.out.println(!(1 > 2));
        
        System.out.println(~0);  //按位取反
        System.out.println(1 | 2); //按位或运算
        System.out.println(1 & 2); //按位与运算
        System.out.println(1 ^ 2); //按位异或运算
        


    }
}
