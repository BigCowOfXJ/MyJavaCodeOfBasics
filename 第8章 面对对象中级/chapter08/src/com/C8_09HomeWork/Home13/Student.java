package com.C8_09HomeWork.Home13;

public class Student extends Person {


    private String stu_id;


    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getWork_age() {
        return stu_id;
    }

    public void setWork_age(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String play() {
        return "老师喜欢玩象棋～～～～～";
    }

    public String study() {
        return "我承诺我会好好学习～～～";
    }

    @Override
    public String printInfo() {
        return "学生的信息如下：" +
                super.printInfo() +
                "学号：" + stu_id + "\n" +
                study() + "\n" +
                play() + "\n";

    }
}

