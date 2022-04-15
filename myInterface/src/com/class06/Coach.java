package com.class06;

public abstract class Coach extends Human{

    public Coach() {
    }

    public Coach(int name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
