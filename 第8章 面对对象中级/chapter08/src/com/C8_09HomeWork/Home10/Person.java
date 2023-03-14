package com.C8_09HomeWork.Home10;

public class Person {

    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Person(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o1) {
        if (this == o1) {
            return true;
        }
        if (!(o1 instanceof Person)) {
            return false;
        }

        Person o2 = (Person) o1;
        if (this.age == o2.age && this.gender == this.gender
                && this.job.equals(o2.job) && this.name.equals(o2.name)
                && this.sal == o2.sal) {
            return true;
        } else {
            return false;
        }

    }
}
