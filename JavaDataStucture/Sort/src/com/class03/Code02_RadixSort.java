package com.class03;

public class Code02_RadixSort {
    // radixSort
    public static void radixSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        radixSort(arr, 0, arr.length - 1, maxbits(arr));
    }

    // maxbits 尋找最大值的十進制位
    public static int maxbits(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int res = 0;
        while (max != 0){
            res++;
            max /= 10;
        }
        return res;
    }

    public static void radixSort(int[] arr, int L, int R, int digit){
        final int radix = 10; // 0~9有10個數
        int i = 0, j = 0;
        // 有多少個數準備多少個輔助空間：有幾個桶
        int[] bucket = new int[R - L + 1];

        // d : 表示位數 eg. d = 1 : 個位數 ,d = 2 : 十位數
        for (int d = 1; d <= digit; d++){ // 有幾個十進制位就要進捅出桶幾次 ： 最大值為100 則要進出桶3次才能排完序
            /*
             建立詞頻表count 每個位置統計小於等於該位置index 的數字有幾個
             eg. count => [1,2,5,7,7,7,7,....]  index = 3 數字是 7 表示個位數 <= 3 的數字有7個
             為了讓先入桶的先出桶, 所以將數據由右向左遍歷 eg. 遇到個位數為3的數, 查詢count 發現小於等於3的有7個
             所以該數應該放在 7-1 = 6位置, 此時count[3]--, 若再遇到個位數為3的數就放在 此時的count[3] - 1的位置
            */


            // 取得數據位數並記入count => count為詞頻統計表
            int[] count = new int[radix];
            for (i = L; i <= R; i++){
                j = getDigit(arr[i], d);
                count[j]++;
            }

            // 將count 轉為累進的詞頻統計表
            for (i = 1; i < radix; i++){
                count[i] = count[i] + count[i - 1];
            }

            // 數組由右往左遍歷, 按上面說的方法放入水桶的index - 1位置
            for (i = R; i >= L; i--){
                j = getDigit(arr[i], d);
                bucket[count[j] - 1] = arr[i];
                count[j]--;
            }

            for (i = L, j = 0; i <= R; i++, j++){
                arr[i] = bucket[j];
            }
        }
    }

    public static int getDigit(int x, int d){
        return ((x / ((int) Math.pow(10, d - 1))) % 10);
    }

}
