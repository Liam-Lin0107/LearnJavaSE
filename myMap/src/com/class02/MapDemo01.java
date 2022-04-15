package com.class02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        // 添加元素
        map.put("001", "林大中");
        map.put("002", "陳韻帆");
        map.put("003", "陳力慈");
        map.put("004", "何寬耘");

        // 遍歷方式1
        for (String s : map.keySet()) {
            String name = map.get(s);
            System.out.println(name);
        }

        // 遍歷方式2
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String, String> me : entrySet){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + " ," + value);
        }

    }
}
