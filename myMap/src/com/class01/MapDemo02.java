package com.class01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("001", "林大中");
        map.put("002", "陳韻帆");
        map.put("003", "何寬耘");

        System.out.println(map.get("003"));

        // Set<E> KeySet() : 讀取所有的健
        Set<String> ketSet = map.keySet();
        for (String key : ketSet){
            System.out.println(key);
        }

        // Collection<V> values() : 獲取所有的值
        Collection<String> values = map.values();
        for (String s : values){
            System.out.println(s);
        }

    }
}
