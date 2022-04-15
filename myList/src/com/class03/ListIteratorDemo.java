package com.class03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

//        ListIterator<String> lit = list.listIterator();
//        while (lit.hasNext()){
//            String s = lit.next();
//            System.out.println(s);
//        }
//
//        System.out.println("----------");

//        while(lit.hasPrevious()){
//            String s = lit.previous();
//            System.out.println(s);
//        }

        // 利用列表迭代器實現添加
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            if (lit.next().equals("world")){
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}

