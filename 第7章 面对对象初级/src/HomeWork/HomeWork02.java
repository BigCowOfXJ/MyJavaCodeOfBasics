package HomeWork;

public class HomeWork02 {
    public static void main(String[] args) {
        String[] arr = {
        "abc","acb","bca"
        };

        Operation02 operation02 = new Operation02();
        System.out.println(operation02.FindString(arr, "bca"));
        System.out.println(operation02.FindString(arr, "zczcz"));
    }
}

class Operation02{
    public int FindString(String[] arr, String name){
        for (int i = 0; i < arr.length; i++) {
            if(name.equals(arr[i])){
                return i;
            }
        }

        return -1;

    }

}
