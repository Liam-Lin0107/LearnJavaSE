package com.class06;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一段英文 : ");
        String s = scanner.nextLine();
        String[] strarr = s.split("");

//        HashMap<String, Integer> hm = new HashMap<>(); <- 沒有對鍵排序
        TreeMap<String, Integer> hm = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.hashCode() - s2.hashCode();
            }
        });
        for (String str : strarr){
            if (hm.containsKey(str)){
                hm.replace(str, hm.get(str) + 1);
            }else{
                hm.put(str, 1);
            }
        }


        StringBuilder sb = new StringBuilder();

        for (String key : hm.keySet()) {
            sb.append(key).append("(").append(hm.get(key)).append(")");
        }
        String result = sb.toString();
        System.out.println(result);

    }
}
