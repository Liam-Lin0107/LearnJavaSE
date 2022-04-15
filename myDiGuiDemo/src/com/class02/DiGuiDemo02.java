package com.class02;

import java.io.File;

/*給定一個位置將所有file的絕對路徑print出來*/
public class DiGuiDemo02 {
    public static void main(String[] args) {
        File f = new File("/Users/lindazhong/Documents/Java");
        getAllFile(f);
    }

    public static void getAllFile(File scrFile){
        File[] fileArray = scrFile.listFiles();
        if (fileArray != null){

        }
    }
}
