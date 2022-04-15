package com.class02;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 100; i > 0; i--){
            System.out.println(getName() + " : " + i);
        }
    }
}
