public class c719VarParameter01 {
    public static void main(String[] args) {
        Var var = new Var();

        var.sum(12, 23, 34, 56, 45, 34);
    }
}

class Var {

    public void sum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum = " + sum);
    }
}
