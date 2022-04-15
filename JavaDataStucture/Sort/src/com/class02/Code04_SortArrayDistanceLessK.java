package com.class02;

import com.class01.GenerateRandomArray;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Code04_SortArrayDistanceLessK {

    public static void sortArrayDistanceLessK(int[] arr, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        // 先形成0~K+1的小根堆
        int index = 0;
        for (; index <= Math.max(arr.length, k); index++){
            heap.add(arr[index]);
        }

        // 再add新的數彈出小跟堆第一個數放在i 位置
        int i = 0;
        for (; index < arr.length; index++, i++){
            arr[i] = heap.poll();
            heap.add(arr[index]);
        }

        while(!heap.isEmpty()){
            arr[i++] = heap.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr = GenerateRandomArray.generateRandomArray(100,100);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
