package com.class05;

public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
    }

    public static int sum(int... a){
        int sum = 0;

        for(int i : a){
            sum += i;
        }
        return sum;
    }
}
