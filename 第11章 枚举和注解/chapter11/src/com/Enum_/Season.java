package com.Enum_;


/*
* 枚举似于单例模式，但是不同的是，枚举类可有多个固定数量的对象
* 而单例模式类只能有一个对象
*
*
*
* */
public class Season {
    public static void main(String[] args) {

        //Season02是自定义的枚举类

       // new Season02();   //这里会报错，私有化构造器类无法在类外创建对象
        System.out.println(Season02.SPRING);
        System.out.println(Season02.SUMMER);
        System.out.println(Season02.AUTUMN);
        System.out.println(Season02.WINTER);
    }
}


class Season02{



    public static final Season02 SPRING = new Season02("春天","万物复苏");
    public static final Season02 SUMMER = new Season02("夏天","炎热酷暑");
    public static final Season02 AUTUMN = new Season02("秋天","秋高气爽");
    public static final Season02 WINTER = new Season02("冬天","雪上加霜");

    private String name;
    private String character;

    private Season02(String name, String character){
        this.name = name;
        this.character = character;
    }

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", character='" + character + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
