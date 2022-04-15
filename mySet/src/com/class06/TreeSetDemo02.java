package com.class06;

import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("林大中", 23);
        Student s2 = new Student("陳韻帆", 24);
        Student s3 = new Student("陳力慈", 23);
        Student s4 = new Student("何寬耘", 26);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        // 當出現ClassCastException 代表Student Class並沒有支持Comparable接口  要去引入該接口
        for (Student s : ts){
            System.out.println(s);
        }
    }
}
