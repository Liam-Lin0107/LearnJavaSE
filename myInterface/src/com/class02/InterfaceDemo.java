package com.class02;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        System.out.println(i.num);
        System.out.println(i.num2);

        /*
        接口默認
        * 1. 所有變數均為常量  <-- 被final 修飾
        * 2. 可以直接由類訪問  <-- 被static 修飾
        * 3. 均是public
        * 4. 接口是沒有構造方法
        * */
        //        i.num = 40;
        System.out.println(Inter.num);
    }
}
