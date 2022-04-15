package com.class01;

import java.io.File;
import java.util.Arrays;

public class FileDemo03 {
    public static void main(String[] args) {
        // 判斷File路徑是否為目錄
        File f1 = new File("/Users/lindazhong/Documents/Java/myFile/Files/JavaSE");
        System.out.println(f1.isDirectory());
        System.out.println("------------------------");
        // 判斷File路徑是否為文件
        File f2 = new File("/Users/lindazhong/Documents/Java/myFile/Files/java.txt");
        System.out.println(f2.isFile());
        System.out.println("------------------------");
        // 判斷File路徑是否存在
        System.out.println(f2.exists());
        System.out.println("------------------------");
        // 返回File的路徑String
            // 絕對路徑
        System.out.println(f2.getPath());
            // 路徑
        System.out.println(f2.getAbsolutePath());
        System.out.println("------------------------");
        // 返回文件或目錄名稱
        System.out.println(f2.getName());
        System.out.println("------------------------");
        // 返回目錄中所有文件的名稱的String[]
        System.out.println(Arrays.toString(f1.list()));
        System.out.println("------------------------");
        // 返回所有目錄中文件並封裝載File[]裡
        System.out.println(Arrays.toString(f1.listFiles()));
        //
    }
}
