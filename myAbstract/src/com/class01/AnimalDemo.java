package com.class01;

public class AnimalDemo {
    public static void main(String[] args) {
//        Animal a = new Animal(); <-- 抽象類不能實例化
        Animal a = new Cat(); // <-利用多態實例化
        a.eat();
        a.sleep();
    }
}
