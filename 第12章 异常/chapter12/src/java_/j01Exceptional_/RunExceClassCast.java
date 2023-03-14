package java_.j01Exceptional_;

@SuppressWarnings({"all"})
public class RunExceClassCast {
    public static void main(String[] args) {
        /*
        这里介绍引用类型转换异常
        public class ClassCastException extends RuntimeException {。。。}
        常见的就是向下转型的错误
         */
        Person person = new Worker();
        try {
            Student stu = (Student) person;
        }catch(Exception e){
            System.out.print(e.getMessage());
            System.out.println("       这里报类转换异常～～～～～～");
        }
    }
}

class Person {
}

class Worker extends Person {
}

class Student extends Person {
}