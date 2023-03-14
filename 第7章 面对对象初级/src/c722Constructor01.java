public class c722Constructor01 {
    public static void main(String[] args) {
        Student_ student = new Student_("jack",18);
        student.info();
    }
}

class Student_{
    String name;
    int age;

    public Student_(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Student_(){
        
    }

    public void info(){
        System.out.println("name = " + name + " age = " + age);
    }

}
