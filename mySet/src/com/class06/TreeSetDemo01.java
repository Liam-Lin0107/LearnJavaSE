package com.class06;

import java.util.TreeSet;
// 經過自然排序故有順序
public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);

        for (Integer i : ts){
            System.out.println(i);
        }

    }
}
