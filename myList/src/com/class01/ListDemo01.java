package com.class01;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        System.out.println(list);

        // 利用for遍歷
        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
