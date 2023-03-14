import javax.security.auth.login.AccountException;

public class c704Method01 {
    public static void main(String[] args) {
        /*
         * 这里我们简单的认识一下方法（对应c语言的函数）
         * 下面是些开胃小菜
         * 
         */

        Action action = new Action(10, 12);

        action.say();
        System.out.println("sum=" + action.sum1(50));
        System.out.println(action.getPropertiseSum());
    }
}

class Action {

    int num1;
    int num2;

    public Action(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void say() {

        System.out.println("我是一个好人，说出来你信吗？哈哈哈");
    }

    public int sum1(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        return sum;
    }

    public int getPropertiseSum() {

        return this.num1 + this.num2;
    }

}
