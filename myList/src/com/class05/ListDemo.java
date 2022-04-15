package com.class05;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林大中", 24);
        Student s2 = new Student("陳韻帆", 24);
        Student s3 = new Student("陳力慈", 23);

        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 利用迭代器遍歷
        ListIterator<Student> lit = list.listIterator();
        while(lit.hasNext()){
            Student s = lit.next();
            System.out.println(s);
        }
        System.out.println("------------");

        // 利用普通For
        for (int i = 0; i < list.size(); i++){
            Student s = list.get(i);
            System.out.println(s);
        }
        System.out.println("------------");

        // 利用增強For
        for (Student i : list){
            System.out.println(i);
        }
    }
}
