package class02;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.name);
        System.out.println(student.age);
        student.study();
        student.doHomework();
    }
}
