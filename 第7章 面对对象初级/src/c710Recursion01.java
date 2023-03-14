public class c710Recursion01 {
    public static void main(String[] args) {

        // 简单的 体会体会递归
        A a = new A();

        a.Test(10);
    }
}

class A {

    public void Test(int num) {

        if (num >= 2) {
            Test(num - 1);
        }
        System.out.println(num);
    }
}
