package com.class01;

public class Student {
    public String name;
    public int age;
    public static String university; // 希望一次賦值後  在新創建新的實力物件時可以共享該變數
    // 故又稱類變量

    public void show(){
        System.out.println(name + " ," + age + " ,"+ university);
    }
}
