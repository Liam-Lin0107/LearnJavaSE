package class02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        addStudent(students);
        addStudent(students);
        addStudent(students);

        for (int i = 0; i < students.size(); i++){
            Student s = students.get(i);
            System.out.println(s.getName() + " ," + s.getAge());
        }

    }

    public static void addStudent(ArrayList<Student> array){
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("請輸入學生姓名 : ");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.print("請輸入學生年齡 : ");
        int age = scanner.nextInt();
        student.setAge(age);

        array.add(student);
    }
}
