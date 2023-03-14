package com.C8_09HomeWork.Home13;

public class Test {
    public static void main(String[] args) {
        Person[] persons = new Person[4];

        persons[0] = new Student("jack",'男',18, "202100001");
        persons[1] = new Student("milan",'女',66, "202100002");
        persons[2] = new Teacher("john", '男', 30, 10);
        persons[3] = new Teacher("mike", '男', 50, 30);

        bubble(persons);
        show(persons);
    }

    public static void bubble(Person[] ps){
        Person temp = null;
        for (int i = 0; i < ps.length; i++) {
            for (int j = 0; j < ps.length - i - 1; j++) {
                if(ps[j].getAge() < ps[j + 1].getAge()){
                    temp = ps[j];
                    ps[j] = ps[j + 1];
                    ps[j + 1] = temp;
                }
            }
        }

    }

    public static void show(Person[] ps){

        Student s1 = null;
        Teacher t1 = null;
        for (int i = 0; i < ps.length; i++) {
            if(ps[i] instanceof Student) {
                s1 = (Student) ps[i];
                System.out.print(s1.printInfo());
                System.out.println("-----------------------");
                continue;
            }
            else if(ps[i] instanceof Teacher) {
                t1 = (Teacher) ps[i];
                System.out.print(t1.printInfo());
                System.out.println("-----------------------");
                continue;
            }

        }
    }
}
