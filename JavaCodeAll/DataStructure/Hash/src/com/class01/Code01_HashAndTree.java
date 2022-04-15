package com.class01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Code01_HashAndTree {
    public static void main(String[] args) {
    // 無序
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        System.out.println(hashSet.contains(3));
        hashSet.remove(3);
        System.out.println(hashSet.contains(3));
        /*
         * 哈希表的key如果是基礎類型e.g. Integer, String....
         *      => 是以值傳遞
         * 如果是自定義類e.g. Student
         *      => 則是以八字節內存地址傳遞與該類在內存空間申請大小無關
         * */
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "zuo");
        hashMap.put(1, "cheng");
        hashMap.put(2, "2");

        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(4)); // 不會報錯

        hashMap.remove(2);
        System.out.println(hashMap.get(2));
        // 哈希表的增刪查改的操作都是O(1)：但是是很大的常數時間
        System.out.println("========================");

    // 有序
        // 因為有序 所以不管put的順序為何都會按照key升序排列
        // 若不是提供基礎類型則要提供Comparator接口
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(7, "我是7");
        treeMap.put(5, "我是5");
        treeMap.put(4, "我是4");
        treeMap.put(3, "我是3");
        treeMap.put(9, "我是9");
        treeMap.put(2, "我是2");
        System.out.println(treeMap.containsKey(5));
        System.out.println(treeMap.get(5));
        System.out.println(treeMap.firstKey()); // key最小
        System.out.println(treeMap.lastKey());  // key最大
        System.out.println(treeMap.ceilingKey(8));
        System.out.println(treeMap.floorKey(8));
        treeMap.remove(5);
        System.out.println(treeMap.get(5));

        // 有序表增刪查改都是O(logN)
        System.out.println("========================");
    }
}
