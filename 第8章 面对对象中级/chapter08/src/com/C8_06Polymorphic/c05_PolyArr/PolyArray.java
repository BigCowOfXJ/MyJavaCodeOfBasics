package com.C8_06Polymorphic.c05_PolyArr;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        persons[0] = new Person("jack", 18);
        persons[1] = new Student("mary", 19, "三好学生");
        persons[2] = new Student("milan", 20, "年级第一");
        persons[3] = new Teacher("jack", 21, "化学");
        persons[4] = new Teacher("john", 22, "计算机");

        for (int i = 0; i < persons.length; i++) {
            if(persons[i] instanceof Student){
                ((Student)persons[i]).study();
                System.out.println(persons[i]);
            }else if(persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teach();
                System.out.println(persons[i]);
            }else{
                persons[i].say();
                System.out.println(persons[i]);
            }
        }
    }
}
