package com.class02;

import java.util.Arrays;

public class Code03_HeapSort {

    // 新增一個數位於index處, 使數據形成大根堆, 可否向上移動
    public static void heapSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }

        // 在0 ~i 位置形成大根堆
//        for (int i = 0; i < arr.length; i++){
//            heapInsert(arr, i);
//        }
        for (int i = arr.length - 1; i >= 0; i--){
            heapify(arr, i, arr.length);
        }

        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while(heapSize > 0){ // O(N)
            heapify(arr, 0, heapSize); // O(logN)
            swap(arr, 0, --heapSize);  // 0(1)
        }
    }


    public static void heapInsert(int[] arr, int index){
          while (arr[index] > arr[(index - 1) / 2]){
              swap(arr, index, (index - 1) / 2);
              index = (index - 1) / 2;
          }
    }

    // 某數在index位置, 能否向下移動
    public static void heapify(int[] arr, int index, int heapSize){
        int left = index * 2 + 1;
        while (index < heapSize - 1){
            int largestIndex = (left + 1 < heapSize - 1) && (arr[left + 1] > arr[left]) ? left + 1 : left;
            largestIndex = arr[largestIndex] > arr[index] ? largestIndex : index;
            if (largestIndex == index){
                break;
            }
            swap(arr, largestIndex, index);
            index = largestIndex;
            left = index * 2 + 1;
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
