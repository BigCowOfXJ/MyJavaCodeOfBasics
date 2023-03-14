public class c723ThisNature {
    public static void main(String[] args) {
        this01 th01 = new this01("jack",18);

        System.out.println(th01);
    }
}

class this01{

    String name;
    int age;

    public this01(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("this的JVM地址 = " + this);
        System.out.println("this的哈希地址 = " + this.hashCode());
    }
}
