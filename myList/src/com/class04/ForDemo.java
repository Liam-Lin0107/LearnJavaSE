package com.class04;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        for (int i : intArr){
            System.out.println(i);
        }
        System.out.println("-----------");

        String[] strArr = {"hello", "world", "java"};
        for (String s : strArr){
            System.out.println(s);
        }
        System.out.println("-----------");

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        for (String s : list){
            System.out.println(s);
        }
    }
}
