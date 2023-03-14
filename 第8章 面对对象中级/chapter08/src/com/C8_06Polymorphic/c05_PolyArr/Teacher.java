package com.C8_06Polymorphic.c05_PolyArr;

public class Teacher extends Person{

    private String subject;
    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach(){
        System.out.println("老师都会教书");
    }

    @Override
    public String toString() {
        return super.toString() +
                "subject='" + subject + '\'' +
                '}';
    }
}
