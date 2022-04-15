package com.class02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");

        // Iterator 附加在集合上的接口
        // 利用iterator 遍歷
        Iterator<String> iterator = c.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
