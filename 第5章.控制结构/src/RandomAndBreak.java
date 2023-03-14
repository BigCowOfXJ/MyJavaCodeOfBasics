public class RandomAndBreak {
    public static void main(String[] args){
        int n = 0;
        while(true){
            n = (int)(Math.random() * 100 ) + 1;
            System.out.println(n);
            if(n == 97){
                break;
            }
        }
        // 对于break指定标签 就不介绍了，尽量不要使用
        // 一般是默认break ，推出所在{}内最近的循环
    }
}
