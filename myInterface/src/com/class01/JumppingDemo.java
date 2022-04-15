package com.class01;

public class JumppingDemo {
    public static void main(String[] args) {
        // 接口不能被實例化

        Jumpping j = new Cat();
        j.jump();

        j = new Dog();
        j.jump();
    }
}
