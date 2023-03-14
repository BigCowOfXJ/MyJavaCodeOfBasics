import java.security.PublicKey;

public class c703Object03 {
    public static void main(String[] args) {

        // . 这里谈谈对象的内存分配机制
        Person person = new Person("jack", 18);
        Person n2 = person;

        person.info();
        n2.info();

        person.age = 10000;

        person.info();
        n2.info();

        // 由编译结果可得
        // n2 与 person 指向的是同一个堆空间，所以修改这两对象的属性，本质上是修改一个对象
        // 就像一个人有两个名字一样。

    }
}

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.printf("name = %s, age = %d\n", name, age);
    }
}
