package com.Enum_;

public class Exercise02 {
    public static void main(String[] args) {

        for(Week weeks : Week.values()){
            System.out.println(weeks);
        }
    }
}

enum Week{

    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期天");
    public String name;

    //下面报错，因为enum修饰的类的构造器的修饰符必须为private
    //public Week(int n1){}
    Week(){}
    private Week(String name){   //这里的private可以省略，编译器会自动加上private
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
