package com.class01;

public class Code01_SelectionSort {
    public static void selectionSort(int[] arr){
        // 遍歷找尋最小後與第一個位置交換, 第一個位置確定, 再遍歷找第一個位置除外的最小與第二個位置交換
        if (arr.length < 2 || arr == null){
            return;
        }
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    public static void swap(int[] arr, int i, int j){
        if(i != j){
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
    }
}
