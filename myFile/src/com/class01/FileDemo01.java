package com.class01;

import java.io.File;

/*File ： 對於File而言封裝的是路徑名
*
* 構造方法
*   1.File(String pathname)
*   2.File(String parent, String child)
*   3.File(File parent, String child)*/
public class FileDemo01 {
    public static void main(String[] args) {
        // method 1:
        File f1 = new File("/Users/lindazhong/Documents/Java/myFile/Files/java.txt");
        System.out.println(f1);
        System.out.println("=========================================");
        // method 2:
        File f2 = new File("/Users/lindazhong/Documents/Java/myFile/Files", "java.txt");
        System.out.println(f2);
        System.out.println("=========================================");
        // method 3:
        File f3 = new File("/Users/lindazhong/Documents/Java/myFile/Files");
        File f4 = new File(f3, "java.txt");
        System.out.println(f4);

    }
}
