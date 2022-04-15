package com.class03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Code01_Comparator {
    // 排序自定義class
    public static class Student{
        private String name = "林大中";
        private int sid;
        private int age;

        public Student() {
        }

        public Student(String name, int sid, int age) {
            this.name = name;
            this.sid = sid;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSid() {
            return sid;
        }

        public void setSid(int sid) {
            this.sid = sid;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "student{" +
                    "name='" + name + '\'' +
                    ", sid=" + sid +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("林大中", 001, 24);
        Student s2 = new Student("林中中", 002, 25);
        Student s3 = new Student("林小中", 003, 26);
        Student[] students = new Student[]{s1, s2, s3};
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(o1.getAge() - o2.getAge());
            }
        });

        System.out.println(Arrays.toString(students));
        System.out.println("=============================");

        // 小根堆轉為大根堆
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        heap.add(6);
        heap.add(9);
        heap.add(3);
        heap.add(2);
        heap.add(10);

        Iterator<Integer> iterator = heap.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
