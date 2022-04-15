package com.class01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();


        // 添加元素
        map.put("001", "林大中");
        map.put("002", "陳韻帆");
        map.put("003", "何寬耘");

        System.out.println(map);

        // 移除值鍵對
        map.remove("002");
        System.out.println(map);

        // clear
        map.clear();
        System.out.println(map);

        // 添加元素
        map.put("001", "林大中");
        map.put("002", "陳韻帆");
        map.put("003", "何寬耘");

        System.out.println((map.containsKey("003")));
        System.out.println((map.containsValue("陳力慈")));
        System.out.println((map.isEmpty()));
        System.out.println((map.size()));

    }
}
