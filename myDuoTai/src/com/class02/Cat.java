package com.class02;

public class Cat extends Animal{
    public int age =20;
    public int weight = 10;

    @Override
    public void eat() {
        System.out.println("貓吃魚");;
    }

    public void playGame(){
        System.out.println("貓捉迷藏");
    }
}
