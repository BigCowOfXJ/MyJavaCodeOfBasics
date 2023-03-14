package com.C8_06Polymorphic.c01_EntryLevel;

public class Master {
    public static void main(String[] args) {
        Dog dog = new Dog("jack", 2);
        Cat cat = new Cat("mary", 2);

        Food food1 = new Food("大棒骨");
        Food food2 = new Food("黄花鱼");

        Master.Feed(dog, food1);
        Master.Feed(cat, food2);
    }


    public static String name;

    static {
        name = "Tom";
    }

    ;

    public static void Feed(Animal animal, Food food) {
        System.out.print("农场主" + Master.name + " 正在喂养 ");
        animal.eat();
        System.out.println(food.getName());


    }
}
