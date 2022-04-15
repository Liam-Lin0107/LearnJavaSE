package com.class01;

import java.util.Arrays;
/*對數器
使用方法
1.先生成隨機數組(testArr) : generateRandomArray()
2.深度複製一個隨機數組(copyArr) : copyArray(testArr)
3.利用自己寫的排序方法排序隨機數組
4.比較結果 : compareResult(copyArr, arr)
* */
public class GenerateRandomArray {

    // 生成隨機大小隨機範圍的整數數組
    public static int[] generateRandomArray(int maxSize, int maxValue){
        int[] arr = new int[(int)((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++){
            // 有負數
//            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int)((maxValue + 1) * Math.random());
            // 只有正數
            arr[i] = (int) ((maxValue + 1) * Math.random());
        }
        return arr;
    }

    // DeepCopy
    public static int[] copyArray(int[] arr){
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            arrCopy[i] = arr[i];
        }
        return arrCopy;
    }

    private static boolean compare(int[] arr1, int[] arr2){
        return Arrays.equals(arr1, arr2);
    }

    public static String compareResult(int[] originArr, int[] sortedArr){
       int[] arr2 = copyArray(originArr);
       Arrays.sort(arr2);
       if (Arrays.equals(arr2, sortedArr)){
           return "結果相符";
        }else{
           return "結果不符";
       }

    }



    // for test
//    public static void main(String[] args) {
//        int[] testArray = GenerateRandomArray.generateRandomArray(1000, 1000);
//        System.out.println(Arrays.toString(testArray));
//    }
}
