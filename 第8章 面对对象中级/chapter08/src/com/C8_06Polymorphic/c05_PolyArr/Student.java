package com.C8_06Polymorphic.c05_PolyArr;

public class Student extends Person{
    private String id;
    public Student(String name, int age, String id){
        super(name, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void study(){
        System.out.println("学生都需要学习～～～～～～～～～");
    }

    @Override
    public String toString() {
        return super.toString() +
                "id='" + id + '\'' +
                '}';
    }
}
