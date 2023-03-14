package HomeWork;

public class Homework07 {
    public static void main(String[] args) {
        Operation07 operation07 = new Operation07("jack", "花色", 18);
        System.out.println(operation07.toString());
        
    }
}

class Operation07{
    private String name;
    private String color;
    private int age;

    public Operation07(String name, String color, int age){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String toString(){
        return "name = " + name + " age = " + age + 
        " color = " + color;

    }


}
