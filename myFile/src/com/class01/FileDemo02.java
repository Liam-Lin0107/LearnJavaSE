package com.class01;

import java.io.File;
import java.io.IOException;
/*File類的功能
*   public boolean creatNewFile() : 若該文件不存在,由抽象路徑建立文件
*   public boolean mkdir()
*   public boolean mkdirs()
* */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/Users/lindazhong/Documents/Java/myFile/Files/java.txt");
        System.out.println(f1.createNewFile());

        // 建立JavaSE目錄
        File f2 = new File("/Users/lindazhong/Documents/Java/myFile/Files/JavaSE");
        System.out.println(f2.mkdir());

        // 創建多級別目錄
        File f3 = new File("/Users/lindazhong/Documents/Java/myFile/Files/JavaSE/JavaWeb/HTML");
        System.out.println(f3.mkdirs());

    }

}
