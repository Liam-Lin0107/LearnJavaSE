package com.class01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        // 利用多態創立Collection
        Collection<String> c = new ArrayList<String>();
        c.add("Hello");
        c.add("World");
        c.add("Java");

        System.out.println(c);
    }
}
