package com.class03;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Pig pig  = new Pig();
        pig.eat();
        Pig.eat();
        AnimalOperation animalOperation = new AnimalOperation();
        animalOperation.ao(dog);
        animalOperation.ao(cat);
        animalOperation.ao(pig);
    }
}
