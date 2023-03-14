public class c701Object01 {
    public static void main(String[] args) throws Exception {
        // 对象的引入

        // 解养猫问题

        Cat cat = new Cat();
        Cat cat2 = new Cat();

        cat.name = "旺财";
        cat.age = 3;
        cat.color = "白色";

        cat2.name = "常威";
        cat2.age = 3;
        cat2.color = "花色";

        System.out.printf("cat 的信息为 name = %s, age = %d, color = %s \n", cat.name, cat.age, cat.color);

        System.out.printf("cat2 的信息为 name = %s, age = %d, color = %s \n", cat2.name, cat2.age, cat2.color);
    }
}

class Cat {
    // 属性
    String name;
    int age;
    String color;

}
