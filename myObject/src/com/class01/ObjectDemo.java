package com.class01;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("林大中");
        s1.setAge(24);
        Student s2 = new Student();
        s2.setName("林大中");
        s2.setAge(24);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); // 需要重寫Object equals代碼
    }
}
