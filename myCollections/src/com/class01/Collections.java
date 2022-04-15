package com.class01;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(50);
        list.add(10);
        list.add(40);
        list.add(20);

        System.out.println(list);
        java.util.Collections.sort(list);
        System.out.println(list);
        java.util.Collections.reverse(list);
        System.out.println(list);
        java.util.Collections.shuffle(list);
        System.out.println(list);
    }
}
