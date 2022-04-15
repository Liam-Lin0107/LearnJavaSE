package com.class01;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        System.out.println("排序前 : " + Arrays.toString(intArray));
        Arrays.sort(intArray);

        StringBuilder sb = new StringBuilder();
       for (int i = 0; i < intArray.length; i++){
           if (i == intArray.length - 1){
               sb.append(intArray[i]);
           }else{
               sb.append(intArray[i] + " ");
           }
       }
       s = sb.toString();
       System.out.println("排序後 : " + s);

    }
}
