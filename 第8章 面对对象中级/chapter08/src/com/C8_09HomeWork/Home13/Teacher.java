package com.C8_09HomeWork.Home13;

public class Teacher extends Person{

    private int work_age;


    public Teacher(String name, char sex, int age, int work_age){
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public String play(){
        return "老师喜欢玩象棋～～～～～";
    }

    public String teach(){
        return "我承诺我会好好教学生～～～";
    }

    @Override
    public String printInfo(){
       return "老师的信息如下：" +
               super.printInfo() +
               "工龄：" + work_age + "\n" +
               teach() + "\n" +
               play() + "\n";

    }
}
