package com.class02;

import com.class01.GenerateRandomArray;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
//        int[] testArr = GenerateRandomArray.generateRandomArray(1000,1000);
        int[] testArr ={1,2,3,4,5};
//        System.out.println(Code1_SmallSum.smallSum(testArr));
//        Code02_QuickSort.quickSort(testArr, 5);
//        System.out.println(Arrays.toString(testArr));
//        int[] copyArr = GenerateRandomArray.copyArray(testArr);
//        Code02_QuickSort.quickSort(testArr);
//        System.out.println(GenerateRandomArray.compareResult(copyArr, testArr));
        int[] copyArr = GenerateRandomArray.copyArray(testArr);
        Code03_HeapSort.heapSort(testArr);
        System.out.println(GenerateRandomArray.compareResult(copyArr, testArr));
    }
}
