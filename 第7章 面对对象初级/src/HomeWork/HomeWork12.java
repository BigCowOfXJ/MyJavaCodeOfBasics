package HomeWork;

public class HomeWork12 {
    public static void main(String[] args) {
        
    }
}

class Operation12{
    String name;
    String gender;
    int age;
    String job;
    double salary;

    public Operation12(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Operation12(String job, double salary){
        this.job = job;
        this.salary = salary;
    }

    public Operation12(String name, String gender, int age,String job, double salary){
        this(name, gender, age);
        this.job = job;
        this.salary = salary;
    }

}
