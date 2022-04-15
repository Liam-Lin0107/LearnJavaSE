package com.class04;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("貓吃魚");
    }

    public void playGame(){
        System.out.println("貓捉迷藏");
    }
}
