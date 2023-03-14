package com.C04_SingleClassOfObject;

public class SingleObject01 {

    //这里展示饿汉式单例设计模式

    public static void main(String[] args) {
        //下面的GirlFriend就是典型的饿汉式单例设计模式类

        //new GirlFriend();  这是报错的语句，构造器私有化无法实例化
        GirlFriend onlygirl = GirlFriend.getInstance();
        onlygirl.setAge(18);
        onlygirl.setName("mary");
        onlygirl.setTall("170");

        System.out.println(onlygirl);
        GirlFriend onlygir2 = GirlFriend.getInstance();
        System.out.println(onlygirl == onlygir2);
    }
}

class GirlFriend{
    private String name;
    private int age;
    private String tall;

    public static GirlFriend onlyGirl = new GirlFriend();

    private GirlFriend(){}

    public static GirlFriend getInstance(){
        return onlyGirl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTall() {
        return tall;
    }

    public void setTall(String tall) {
        this.tall = tall;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tall='" + tall + '\'' +
                '}';
    }
}
