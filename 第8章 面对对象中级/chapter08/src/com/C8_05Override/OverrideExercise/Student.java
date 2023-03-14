package com.C8_05Override.OverrideExercise;

public class Student extends Person{

    //属性
    private String id;
    private double score;

    public Student (String name, int age, String id, double score){
        super(name,age);
        this.id = id;
        this.score = score;
    }

    public void say(){
        System.out.print("id is " + id + "\n" + " score is " + score + " \n");
        super.say();
    }
}
