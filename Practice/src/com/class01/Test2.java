package com.class01;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("請輸入一個數 : ");
        int x = scanner.nextInt();
        boolean result = isEven(x);
        System.out.println("結果為偶數嗎？ " + result);
    }

    public static boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }else{
            return false;
        }

    }


}
