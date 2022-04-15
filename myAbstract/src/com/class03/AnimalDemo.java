package com.class03;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + " ," + a.getAge());
        a.eat();
        System.out.println("---------");

        a = new Cat(5, "加菲");
        System.out.println(a.getName() + " ," + a.getAge());
        a.eat();
    }
}
