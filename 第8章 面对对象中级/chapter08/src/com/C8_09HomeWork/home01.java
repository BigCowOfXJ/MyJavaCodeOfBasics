package com.C8_09HomeWork;

public class home01 {

    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Person("jack",20,"工程师");
        persons[1] = new Person("milan",19,"程序员");
        persons[2] = new Person("john",18,"教师");
        bubbleObject(persons);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }

    public static void bubbleObject(Person[] persons){
        int temp;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if(persons[j].getAge() > persons[j + 1].getAge()){
                     temp = persons[j].getAge();
                     persons[j].setAge(persons[j + 1].getAge());
                     persons[j + 1].setAge(temp);
                }
            }
        }

    }
}

class Person{

    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
