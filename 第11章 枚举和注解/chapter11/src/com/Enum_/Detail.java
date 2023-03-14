package com.Enum_;

public class Detail {
    public static void main(String[] args) {
        Player.Player01.play();


    }
}

interface Music{
    void play();
}
class AB{}

//下面报错，因为
//final class com.Enum Player2 extends java. lang. Enum<com.Player2>
//这里已经继承了，所以不能再继承其他类，java是单继承机制，但是可以实现接口(对单继承机制的补充)
//除此之外，final修饰的类不能再被其他类继承了。所以enum关键字修饰的类不能被其他类继承
//enum Player2 extends AB{}
enum Player implements Music{
    Player01;

    public void play(){
        System.out.println("音乐器 正在播放音乐～～～～～～～～～");
    }

}