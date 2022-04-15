package practice.class02;

import com.class01.GenerateRandomArray;

import java.util.Arrays;


public class HeapSort {
    public static void heapSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }

        // 形成大根堆
        for (int i = arr.length - 1; i >= 0; i--){
            heapify(arr, i, arr.length);
        }

        // 第一個與最後個位置交換
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0){
            heapify(arr, 0, --heapSize);
            swap(arr, 0, heapSize);
        }
    }


    // 向上移動
    public static void heapInsert(int[] arr, int index){
        while (arr[index] > arr[(index - 1) / 2 ]){
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }


    // 向下移動
    public static void heapify(int[] arr, int index, int heapSize){
        int left = index * 2 + 1;
        while (left < heapSize){
            int largestIndex = index * 2 + 2 < heapSize && arr[left] > arr[left + 1] ? left : left + 1;
            largestIndex = arr[index] >= arr[largestIndex] ? index : largestIndex;
            if (index == largestIndex){
                break;
            }
            swap(arr, index, largestIndex);
            index= largestIndex;
            left = largestIndex * 2 + 1;
        }
    }


    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] testArr = GenerateRandomArray.generateRandomArray(1000,1000);
        int[] copyArr = GenerateRandomArray.copyArray(testArr);
        HeapSort.heapSort(testArr);
        System.out.println(GenerateRandomArray.compareResult(copyArr, testArr));
    }

}
