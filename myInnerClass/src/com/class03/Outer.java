package com.class03;

public class Outer {
    private int num = 10;

    public void method(){

        // 局部內部類
        class Inner{
            public void show(){
                System.out.println(num);
            }
        }

        Inner i = new Inner();
        i.show();
    }
}
