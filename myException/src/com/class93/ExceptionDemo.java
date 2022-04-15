package com.class93;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("開始");
//        method();
//        method2();
        System.out.println("結束");
    }

    // 運行時異常
    public static void method() throws ArrayIndexOutOfBoundsException{
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }

    // 編譯時異常
    public static void method2() throws ParseException {
        String s = "2048-08-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}
