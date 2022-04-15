package com.class02;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("開始");
        method();
        System.out.println("結束");
    }
     // 原本結束是不會運行的 但try catch 可以繼續運行下去
    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }

}
