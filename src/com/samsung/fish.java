package com.samsung;

public class fish implements Animal{

    private String name;

    public fish(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Буль Буль");
    }

    @Override
    public void move() {
        System.out.println("Я плыву");
    }
}
