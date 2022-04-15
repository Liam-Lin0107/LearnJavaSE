package com.class06;

public abstract class Human {
    int name;
    int age;

    public Human() {
    }

    public Human(int name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}
