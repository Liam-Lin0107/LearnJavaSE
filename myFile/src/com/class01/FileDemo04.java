package com.class01;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        // 創建文件
        File f1 = new File("myFile/java.txt");
        System.out.println(f1.createNewFile());
        // 刪除文件 （目錄也行） 但不能刪除有內容的目錄, 要先刪除內容
        System.out.println(f1.delete());
    }
}
