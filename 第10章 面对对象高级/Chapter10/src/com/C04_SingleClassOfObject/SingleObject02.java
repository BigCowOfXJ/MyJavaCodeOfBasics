package com.C04_SingleClassOfObject;

public class SingleObject02 {
    public static void main(String[] args) {
        //下面的YourGirlFriend 是典型的懒汉式单例设计模式类

        //YourGirlFriend onlyGirl = new YourGirlFriend();  报错了，构造器私有化无法实例化
        //单例模式与abstract 和 interface 不一样，前者是因为构造器私有化，后两者是语法要求。
        YourGirlFriend onlyGirl = YourGirlFriend.getInstance();
        onlyGirl.setAge(18);
        onlyGirl.setName("mary");
        onlyGirl.setTall("170");

        System.out.println(onlyGirl);

        YourGirlFriend youronlyGirl = YourGirlFriend.getInstance();
        System.out.println(youronlyGirl == onlyGirl);
    }
}

class YourGirlFriend{
    private String name;
    private int age;
    private String tall;

    public static YourGirlFriend onlyGirl;

    private YourGirlFriend(){}

    public static YourGirlFriend getInstance(){

        if(onlyGirl == null){
            onlyGirl = new YourGirlFriend();
        }
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
        return "YourGirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tall='" + tall + '\'' +
                '}';
    }
}

