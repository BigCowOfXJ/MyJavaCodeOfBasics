package com.HomeWork_;

@SuppressWarnings({"all"})
public class HomeWork06 {

    public static void main(String[] args) {
        Color[] colors = Color.values();
        for(Color color : colors){
            color.show();
        }

        System.out.println("=========================");
        for(Color color : colors){
            switch(color){
                //枚举类：引用名
                case RED:
                    color.show();
                    break;
                case BLUE:
                    color.show();
                    break;
                case BLACK:
                    color.show();
                    break;
                case YELLOW:
                    color.show();
                    break;
                case GREEN:
                    color.show();
                    break;
            }
        }

    }
}
interface Show{
    void show();
}
enum Color implements Show{
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int buleValue;

    private Color(int redValue, int greenValue, int buleValue){
        this.buleValue = buleValue;
        this.redValue = redValue;
        this.greenValue = greenValue;
    }

    public void show(){
        System.out.println(this + " red is" + redValue + "\n" +
                "green is" + greenValue + "\n" +
                "bule is" + buleValue + "\n"
        );
    }
}

