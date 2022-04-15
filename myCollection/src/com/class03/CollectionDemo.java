package com.class03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();

        Student s1 = new Student("林大中", 24);
        Student s2 = new Student("陳韻帆", 24);
        Student s3 = new Student("陳力慈", 23);

        c.add(s1);
        c.add(s2);
        c.add(s3);
        // 遍歷集合
        Iterator<Student> it = c.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() + " ," + s.getAge());
        }

    }
}
