package com.class04;

import com.sun.security.jgss.GSSUtil;

/*
* 向上轉型
*   從子到父
*   父類引用指向子類對象
*
* 向下轉型
*   從父到子
*   子類引用指向父類對象
* */
public class AnimalDemo {
    public static void main(String[] args) {
        // 向上轉型
        Animal animal = new Cat();
        animal.eat();
//        animal.playGame(); <-- 會報錯因為父類沒有
        // 為了使用子類特有的方法（playGame())但不希望在new Cat()佔空間
        // 使用向下轉型
        System.out.println("-------------");
        Cat cat = (Cat) animal;
        cat.eat();
        cat.playGame();
    }
}
