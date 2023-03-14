public class c709MethodExercise02 {
    public static void main(String[] args) {
        int[][] arr = {
            {1},
            {1,2},
            {1,2,3},
            {1,2,3,4}
        };

        MyTools myTools = new MyTools();

        myTools.printArr(arr);

        Person03 person03 = new Person03();
        person03.age = 18;
        person03.name = "jack";

        Person03 person003 = person03.CopyPerson03(person03);

        System.out.printf("person03信息 age = %d, name = %s\nperson03 哈希地址为", person03.age, person03.name);
        System.out.println(person03);
        System.out.printf("person003信息 age = %d, name = %s\nperson03 哈希地址为", person003.age, person003.name);
        System.out.println(person003);
    }
}

class MyTools{


    public void printArr(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class Person03{

    String name;
    int age;

    public Person03 CopyPerson03(Person03 p1){
        Person03 person03 = new Person03();

        person03.age = p1.age;
        person03.name = p1.name;

        return person03;
    }
}



