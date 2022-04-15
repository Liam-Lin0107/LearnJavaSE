package com.class01;

public class FileOutputStreamDemo03 {
    int a = 10;
    int b = 20;


    public static void main(String[] args) {

        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    void swap(int a1, int b1){
        int temp = a1;
        this.a = b1;
        this.b = temp;
    }



}
