package com.class01;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world"); // 不包含重複

        // 遍歷
        for(String s : set){
            System.out.println(s); // 不保證遍歷順序
        }
    }
}
