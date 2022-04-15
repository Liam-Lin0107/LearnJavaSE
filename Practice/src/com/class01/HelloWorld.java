package com.class01;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = arr;
        arr1[1] = 200;
        System.out.println(arr1[1]);
        System.out.println(arr[1]);
        System.out.println("=========");
        int[] arr2 = {1,2,3,4,4,5,6,4};
        System.out.println(Arrays.toString(arr2));



    }
}
