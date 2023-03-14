package com.C08_InnerClass;

public class c07AnonymousInnerExercise02 {
    public static void main(String[] args) {
        CellPhone.alarmclock(new Bell(){
            public void ring(){
                System.out.println("懒猪起床了～～～～～～～");
            }
        });

        CellPhone.alarmclock(new Bell(){
            public void ring(){
                System.out.println("起床上学区了～～～～～～～");
            }
        });
    }
}
interface Bell{
    void ring();
}

class CellPhone{

    public static void alarmclock(Bell bell){
        bell.ring();
    }
}
