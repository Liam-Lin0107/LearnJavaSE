package com.class02;

public class Phone {
    // 成員變量
    public int price;
    public String brand;

    // 構造方法
    public Phone(int price, String brand){
        this.price = price;
        this.brand = brand;
    }

    // 成員方法
    public void call(){
        System.out.println("打電話中.....");
    }

    public void sendMessage(){
        System.out.println("發簡訊中.....");
    }

    public static void main(String[] args) {
    }
}