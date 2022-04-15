package com.class01;

public class SystemDemo {
    public static void main(String[] args) {
//        System.out.println("開始");
//        System.exit(0); // 終止JVM
//        System.out.println("結束");
//
//        System.out.println(System.currentTimeMillis());
//        // 與1970/1/1差幾年
//        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年") ;
//        // 乘上1.0主要是為了讓他變成浮點數更精確


        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗時" + (end - start));
    }
}
