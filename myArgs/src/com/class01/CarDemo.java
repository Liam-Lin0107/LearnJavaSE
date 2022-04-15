package com.class01;

public class CarDemo {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat cat = new Cat();

        co.useCat(cat);

        Cat cat1 = co.getCat();
        cat1.eat();
    }
}
