package com.class01;

public class Fu {
    public void show1(){
        System.out.println("public");
    }

    private void show2(){
        System.out.println("private");
    }

    void show3(){
        System.out.println("default");
    }

    protected void show4(){
        System.out.println("protected");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.show1();
        fu.show2();
        fu.show3();
        fu.show4();
    }
}
