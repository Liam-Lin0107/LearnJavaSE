package com.class01;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-88));
        System.out.println("---------------");
        System.out.println(Math.ceil(12.34));
        System.out.println("---------------");
        System.out.println(Math.floor(12.34));
        System.out.println("---------------");
        System.out.println(Math.round(12.34));
        System.out.println("---------------");
        System.out.println(Math.max(12, 8));
        System.out.println("---------------");
        System.out.println(Math.min(12, 8));
        System.out.println("---------------");
        System.out.println(Math.pow(2, 5));
        System.out.println("---------------");
        System.out.println(Math.random());
        System.out.println((int)(Math.random() * 100) + 1); // 0~100的取值方式
    }
}
