package com.class01;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57};
        System.out.println("排序前 : " + Arrays.toString(arr));
        System.out.println("排序後 : " + arrayToString(bubbleSort(arr)));
    }

    public static String arrayToString(int[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                stringBuilder.append(arr[i]);
            }else{
                stringBuilder.append(arr[i] + ", ");
            }
        }
        stringBuilder.append("]");
        String s = stringBuilder.toString();
        return s;
    }

    public static int[] bubbleSort(int[] arr){
        for (int i = arr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        if(i != j){
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
    }
}

