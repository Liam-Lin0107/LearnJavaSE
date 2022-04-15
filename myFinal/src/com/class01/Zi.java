package com.class01;

public class Zi extends Fu{

    @Override
    public void method(){
        System.out.println("Zi method");
    }
    /* final 修飾的方法是不能被Override的*/

    int final age = 20;
    public void show(){
        age = 100;
    }
    /* final 修飾的變量是無法再重新賦值*/

    /* final 修飾的類是不能被繼承的*/


}
