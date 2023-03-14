package com.C8_04Extends;

public class C8_03_Graduate02 extends C8_01_Student{


    public C8_03_Graduate02(String name, int age, String grade) {
        setName(name);
        setAge(age);
        setGrade(grade);
    }
    public C8_03_Graduate02(){

    }

    public String toString(){
        return "C8_02_Graduate{" +
                "大学生" +"name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", grade='" + getGrade() + '\'' +
                '}';
    }
}
