package com.class03;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.setName("哈士奇");
        a.setAge(4);
        System.out.println(a.getName() + " ," + a.getAge());

        ((Dog) a).jump();

        System.out.println("-----------");

        a = new Cat("加菲", 6);
        System.out.println(a.getName() + " ," + a.getAge());
        ((Cat) a).jump();

        System.out.println("-----------");

        /*以下才是正常用法*/

        Cat cat = new Cat("加菲", 5);
        System.out.println(cat.getName() + " ," + cat.getAge());
        cat.jump();
    }
}
