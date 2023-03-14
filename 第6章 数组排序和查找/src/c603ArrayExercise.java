public class c603ArrayExercise {
    public static void main(String[] args) {
        char arr[] = new char[26];
        arr[0] = 'a';

        for (int i = 1; i < arr.length; i++) {
            arr[i] = (char) (arr[0] + i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
