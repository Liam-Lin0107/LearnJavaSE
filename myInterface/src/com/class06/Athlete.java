package com.class06;

public abstract class Athlete extends Human{
    public Athlete() {
    }

    public Athlete(int name, int age) {
        super(name, age);
    }

    public abstract void study();
}
