package com.class02;

public class Outer {

    private int num = 10;

    // 內部類通常使用private封裝起來所以要特別寫取得方法
//    public class Inner{
//        public void show(){
//            System.out.println(num);
//        }
//    }

    // 常見版本
    private class Inner{
        public void show(){
            System.out.println(num);
        }
    }

    // 內部類使用方法：類似getter
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
