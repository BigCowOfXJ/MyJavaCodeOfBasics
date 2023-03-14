public class c708MethodParameter02 {
    public static void main(String[] args) {
        /*
         * 谈谈方法传参机制（引用数据类型）
         * 
         * 
         */
        int[] arr = { 1, 2, 3, 4 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Operation(arr);
        System.out.println("=========~");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Person02 person = new Person02();

        person.age = 19;
        person.name = "jack";

        System.out.println("age = " + person.age + " name = " + person.name);
        System.out.println("============~");
        Operation02(person);
        System.out.println("age = " + person.age + " name = " + person.name);


    }

    public static void Operation(int[] arr) {

        arr[1] = 999;

    }

    public static void Operation02(Person02 person){
        person.age = 0;
        person.name = "无名";
    }
}

class Person02{
    String name;
    int age;
    public  void f1(){
       
    }
}
