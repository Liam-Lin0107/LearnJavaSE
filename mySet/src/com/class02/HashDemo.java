package com.class02;

public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞", 30);
        // 同一個對象多次調用hashCode()相同
        System.out.println(s1.hashCode()); // 918221580
        System.out.println(s1.hashCode()); // 918221580
        System.out.println("---------------");

        // 默認情況下, 不同對象的hashCode()不同
        Student s2 = new Student("林青霞", 30);
        System.out.println(s2.hashCode()); // 2055281021
        System.out.println("---------------");



    }
}
