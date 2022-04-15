package com.class04;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("張曼玉", 35);
        Student s3 = new Student("王祖賢", 33);
        Student s4 = new Student("王祖賢", 33);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        // 為了保證唯一性  要重寫equals()與hashCode()方法
        for (Student s : hs){
            System.out.println(s);
        }
    }
}
