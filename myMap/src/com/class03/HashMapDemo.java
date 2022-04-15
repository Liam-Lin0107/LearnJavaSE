package com.class03;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();

        // 生成學生對象
        Student s1 = new Student("林大中", 24);
        Student s2 = new Student("陳韻帆", 23);
        Student s3 = new Student("陳力慈", 24);
        Student s4 = new Student("何寬耘", 24);

        // 添加鍵值對
        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);
        hm.put("004", s4);

        // 遍歷方法1
        for (String s : hm.keySet()){
            Student student = hm.get(s);
            System.out.println(student);

        }
        System.out.println("-------------");
        // 遍歷方法2
        for (Map.Entry<String, Student> stringStudentEntry : hm.entrySet()) {
            System.out.println(stringStudentEntry.getValue());
        }


    }
}
