package com.class08;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = (s2.getChinese() + s2.getMath()) - (s1.getMath() + s1.getChinese());
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        Student s1 = new Student("林大中", 100, 100);
        Student s2 = new Student("陳大中", 60, 100);
        Student s3 = new Student("王大中", 90, 20);
        Student s4 = new Student("賴大中", 50, 30);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for(Student s : ts){
            System.out.println(s);
        }


    }



}
