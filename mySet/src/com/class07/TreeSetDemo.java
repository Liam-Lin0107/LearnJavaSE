package com.class07;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // s1 : this s2 : s
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        Student s1 = new Student("林大中", 23);
        Student s2 = new Student("陳韻帆", 24);
        Student s3 = new Student("陳力慈", 23);
        Student s4 = new Student("何寬耘", 26);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student s : ts){
            System.out.println(ts);
        }
    }
}
