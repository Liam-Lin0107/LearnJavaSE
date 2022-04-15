package com.class01;

import java.util.ArrayList;
import java.util.Collection;
/*
Collection常用方法
* boolean add()
* boolean remove()
* void clear()
* boolean contain()
* boolean isEmpty()
* int size()
* */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);

//        c.remove("world");
//        System.out.println(c);

//        c.clear();
//        System.out.println(c);

        System.out.println(c.contains("world"));
        System.out.println(c.contains("javaee"));

        System.out.println(c.isEmpty());

        System.out.println(c.size());


    }
}
