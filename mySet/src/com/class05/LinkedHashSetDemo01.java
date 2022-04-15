package com.class05;

import java.util.LinkedHashSet;
// 利用鍊錶保證有序
public class LinkedHashSetDemo01 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        linkedHashSet.add("world");

        for (String s : linkedHashSet){
            System.out.println(s);
        }
    }

}
