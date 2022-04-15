package com.class02;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();


        // run 用於封裝線程要調用的程序,但方法並沒有啟用多線程,等於普通方法調用
//        my1.run();
//        my2.run();
        // 要使用 stat()方法才會使用線程,JVM會自己調用run()
        my1.start();
        my2.start();
    }
}
