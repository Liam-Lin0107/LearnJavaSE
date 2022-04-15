package com.class01;

public class StudentDemo {
    public static void main(String[] args) {

        Student.university = "台灣大學"; // 類變量直接再類中賦值（大寫）
        Student student1 = new Student();
        student1.name = "林大中";
        student1.age = 24;
        student1.show();
        Student student2 = new Student();
        student2.show();
    }
}
