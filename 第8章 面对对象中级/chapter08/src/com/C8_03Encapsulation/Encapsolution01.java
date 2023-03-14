package com.C8_03Encapsulation;


//这里就是写代码
//具体含义看讲义
//不是重点或是简单的就不给予注释解释了。
public class Encapsolution01 {

    public static void main(String[] args) {
        Person01 person = new Person01();

        person.setName("Jack");
        person.setAge(18);
        person.setJob("程序员");
        person.setSalary(30000);

        System.out.println(person);

        person.setAge(130);
        person.setName("adasafyyagsjhajgsgash");

        Person01 person02 = new Person01("jacksdssdasdas",18,30000,"程序员");
        System.out.println(person02);

    }
}

class Person01 {
    //属性
    private String name;
    private int age;
    private double salary;
    private String job;

    public Person01(String name, int age, double salary, String job){
        setName(name);
        setJob(job);
        setAge(age);
        setSalary(salary);
    }
    public Person01(){

    }



    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if(name.length() < 2 || name.length() > 6){
            System.out.println("名字长度有误，给默认名 ： 无名～～～～～");
            this.name = "无名";
            return;
        }

        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age < 0 || age > 120){
            System.out.println("你的年龄输入错误，给默认值为：0～～～～～～");
            age = 0;
        }

        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                '}';
    }
}
