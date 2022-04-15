package com.class02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        // 利用iterator時會造成併發修改異常 ConcurrentModificationException
        // 概念添加之後迭代器無法接受改變後的內容
        // 無法邊迭代邊添加
//        Iterator<String> iterator = list.iterator();
//
//        while(iterator.hasNext()){
//            String s = iterator.next();
//
//            if(s.equals("world")){
//                list.add("javaee");
//            }
//        }

        // 改為不利用迭代器的方式去遍歷

        for (int i =0; i < list.size(); i++){
            String s = list.get(i);
            if (s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
}
