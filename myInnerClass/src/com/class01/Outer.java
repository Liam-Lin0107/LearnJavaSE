package com.class01;

public class Outer {
    private int num = 10;

    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }


//  以下會報錯 因為內部類要使用的話要new一個出來
//    public void method(){
//        show();
//    }

    // 正確版
    public void method(){
        Inner i = new Inner();
        i.show();
    }


    // for test
    public static void main(String[] args) {

    }
}
