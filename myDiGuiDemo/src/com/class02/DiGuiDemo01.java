package com.class02;

public class DiGuiDemo01 {
    public static void main(String[] args) {
        System.out.println(jc(20));
    }

    public static long jc(int n){
        if(n == 1){
            return 1;
        }
        return n * jc(n - 1);
    }
}
