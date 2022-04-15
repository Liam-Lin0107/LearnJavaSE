package com.class01;

import java.util.HashMap;
import java.util.HashSet;

public class Code01_HashAndTree {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(3);
        System.out.println(hashSet1.contains(3));
        hashSet1.remove(3);
        System.out.println(hashSet1.contains(3));

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "zuo");
        hashMap.put(1, "cheng"); // 更新1的value
        hashMap.put(2, "2");

        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(4));

    }
}
