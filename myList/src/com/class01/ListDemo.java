package com.class01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*List 內容可重複且具有索引*/
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");

//        System.out.println(list);

        // 迭代器遍歷
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }


    }
}
