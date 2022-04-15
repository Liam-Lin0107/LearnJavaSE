package com.class05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<>();
        HashMap<String, String> hm1 = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>();
        HashMap<String, String> hm3 = new HashMap<>();

        hm1.put("孫策", "大橋");
        hm1.put("周瑜", "小橋");

        hm2.put("郭靖", "黃蓉");
        hm2.put("楊過", "小龍女");

        hm3.put("令狐沖", "任盈盈");
        hm3.put("林平之", "岳靈珊");

        array.add(hm1);
        array.add(hm2);
        array.add(hm3);

        for(HashMap<String, String> hm : array){

            for (Map.Entry<String, String> stringStringEntry : hm.entrySet()) {
                System.out.println(stringStringEntry.getKey() + " ," + stringStringEntry.getValue());
            }
            System.out.println("--------------");
        }
    }
}
