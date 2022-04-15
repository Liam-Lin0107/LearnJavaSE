package com.class02;

public class InnerDemo {
    public static void main(String[] args) {
//        // 創建內部類  並使用該方法
//        Outer.Inner oi = new Outer().new Inner();
//        oi.show();

        // 封裝類後使用方法
        Outer o = new Outer();
        o.method();
    }
}
