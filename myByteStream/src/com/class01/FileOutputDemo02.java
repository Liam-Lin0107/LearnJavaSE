package com.class01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/lindazhong/Documents/Java/myByteStream/src/com/class01/fos.txt");
        byte[] bys = "abcde".getBytes(StandardCharsets.UTF_8);
        fos.write(bys);
        fos.close();
    }
}
