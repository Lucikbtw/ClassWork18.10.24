package com.samsung;

public class cat implements Animal{

    private String name;
    private String color;

    @Override
    public void say() {
        System.out.println("МЯУ");
    }

    @Override
    public void move() {
        System.out.println("БЕГУ");
    }
}
