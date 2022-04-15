package com.class05;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo02 {
    public static void main(String[] args) {
        // asList() : 返回由指定數組支持的固定大小列表
        List<String> list = Arrays.asList("hello", "world", "java");
        //   list.add("javaee");  <- 不允許
        System.out.println(list);

        // List.of() : 返回包含任意數量元素的不可變數組
        List<String> list1 = List.of("hello", "world", "java");
        //  list1.add("javaee"); <- 不允許


        // Set.of() : 返回一個包含任一數的不可變集合
        Set<String> set = Set.of("hello", "world", "java");
        System.out.println(set);


    }
}
