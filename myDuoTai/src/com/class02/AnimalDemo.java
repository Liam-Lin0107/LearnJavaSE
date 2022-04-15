package com.class02;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        System.out.println(animal.age); // 成員變量沒有重寫所以都看左邊
//        System.out.println(animal.eat()); // 成員方法有重寫所以都看右邊
    }
}
