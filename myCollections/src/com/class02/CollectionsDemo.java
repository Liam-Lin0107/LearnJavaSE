package com.class02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("林大中", 25);
        Student s2 = new Student("陳韻帆", 23);
        Student s3 = new Student("陳力慈", 23);
        Student s4 = new Student("何寬耘", 21);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        ListIterator<Student> studentListIterator = students.listIterator();
        while(studentListIterator.hasNext()){
            Student student = studentListIterator.next();
            System.out.println(student.getName() + " ," + student.getAge());
        }

    }
}
