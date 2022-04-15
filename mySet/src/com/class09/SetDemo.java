package com.class09;

import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        while (ts.size() < 10){
            Integer rand = (int) (Math.random() * 20 + 1);
            ts.add(rand);
        }
        for (int d : ts){
            System.out.println(d);
        }
    }
}
