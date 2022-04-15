package com.class01;

public abstract class Animal {
    /*
    public void eat(){
        System.out.println("吃東西");

     */ //<-- 因為不希望繼承過去的子類eat()方法都一樣又不想重寫

    // 抽象方法, 但要在抽象類
    public abstract void eat();

    public void sleep(){
        System.out.println("睡覺");
    }
}

