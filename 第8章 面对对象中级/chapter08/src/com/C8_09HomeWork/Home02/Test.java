package com.C8_09HomeWork.Home02;

public class Test {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];

        teachers[0] = new Professor("jack",55,"教授",200000);
        teachers[1] = new Adjunctprofessor("jack02",55,"教授",200000);
        teachers[2] = new Lecturer("jack03",55,"教授",200000);

        show(teachers);


    }

    public static void show(Teacher[] teachers){
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i].introduce());
        }
    }
}
