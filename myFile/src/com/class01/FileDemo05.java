package com.class01;

import java.io.File;

public class FileDemo05 {
    public static void main(String[] args) {
        File f = new File("/Users/lindazhong");
        System.out.println(getAllFile(f));
    }

    public static int getAllFile(File f){
        File[] srcFile = f.listFiles();
        int sum = 0;
        if (srcFile != null){
            for (File file : srcFile){
                if (file.isDirectory()){
                    getAllFile(file);
                }
                System.out.println(file.getAbsolutePath());
                sum++;
            }
        }
        return sum;
    }
}
