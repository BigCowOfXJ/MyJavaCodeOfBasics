package com.Enum_;

public class Season2 {
    public static void main(String[] args) {
        System.out.println(Season3.SPRING);
        System.out.println(Season3.SUMMER);
        System.out.println(Season3.AUTUMN);
        System.out.println(Season3.WINTER);
        System.out.println(Season3.WHAT);


    }
}
//class AA extends Season3{}  //这里报错，enum关键字修饰的类是final类，final类不能被继承

enum Season3{

    //枚举对象必须放在该类块的第一个位置，于this()和super()一样。
    //声明对象时，若调用的无参构造器，则()可以省略，但不建议。中间用，隔开，末尾用；结束。
    SPRING("春天","万物复苏"),SUMMER("夏天","炎热酷暑"),
    AUTUMN("秋天","秋高气爽"),WINTER("冬天","雪上加霜"),
    WHAT;


    private String name;
    private String character;

    //下面报错，因为枚举变量需要放在该类块的首位置
//    SPRING("春天","万物复苏"),SUMMER("夏天","炎热酷暑"),
//    AUTUMN("秋天","秋高气爽"),WINTER("冬天","雪上加霜"),
//    WHAT;

    private Season3(String name, String character){
        this.name = name;
        this.character = character;
    }
    private Season3(){

    }


    @Override
    public String toString() {
        return "Season3{" +
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


