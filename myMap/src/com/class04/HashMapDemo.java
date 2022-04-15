package com.class04;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("林大中", 24);
        Student s2 = new Student("陳韻帆", 23);
        Student s3 = new Student("陳力慈", 24);
        Student s4 = new Student("何寬耘", 24);
        Student s5 = new Student("何寬耘", 24);

        // 添加鍵值對
        hm.put(s1, "桃園");
        hm.put(s2, "台北");
        hm.put(s3, "台南");
        hm.put(s4, "台中");
        hm.put(s5, "台北");

        // 遍歷
        Set<Student> students = hm.keySet();
        for (Student key : students){
            String s = hm.get(key);
            System.out.println(s);

        }

    }

}
