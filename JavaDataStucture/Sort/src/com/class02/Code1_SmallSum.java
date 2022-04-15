package com.class02;

public class Code1_SmallSum {
    public static int smallSum(int[] arr){
        return process(arr, 0, arr.length - 1);
    }

    private static int process(int[] arr, int L, int R){
        if (L == R){
            return 0;
        }
        int mid = L + ((R - L) >> 1);

        return process(arr, L, mid)+
                process(arr, mid + 1, R)+
                merge(arr, L, mid, R);
    }

    private static int merge(int[] arr, int L, int M, int R){
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        int smallSum = 0;
        while (p1 <= M && p2 <= R){
            smallSum += arr[p1] < arr[p2] ? arr[p1] * (R - p2 +1) : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= M){
            help[i++] = arr[p1++];
        }

        while (p2 <= R){
            help[i++] = arr[p2++];
        }

        for (int k =0; k < help.length; k++){
            arr[L + k] = help[k];
        }

        return smallSum;
    }
}
