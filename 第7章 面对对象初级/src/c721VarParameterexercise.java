public class c721VarParameterexercise {
    public static void main(String[] args) {
        Student student = new Student();

        student.GetMessage("jack", 12);
        student.GetMessage("milan", 12, 24);
        student.GetMessage("john", 12, 34, 45);
    }
}

class Student {

    public void GetMessage(String name, int... grade) {
        System.out.println("name = " + name);

        for (int i = 0; i < grade.length; i++) {
            System.out.println("第" + (i + 1) + "门课成绩为 " + grade[i]);
        }
    }

}