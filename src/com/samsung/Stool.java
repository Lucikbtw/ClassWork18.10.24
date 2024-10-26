package com.samsung;

public class Stool {
    private String color = "Black";
    private int countLeg;
    private String material;
    private boolean idRoller;

    public String getColor() {
        return color;
    }

    public int getCountLeg() {
        return countLeg;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isIdRoller() {
        return idRoller;
    }

    public void crush(int countCrush) {
        countLeg -= countCrush;
        if(countCrush < 0) countLeg = 0;
    }

    private void validCrush (int countLeg) {
        if(countLeg < 0) countLeg = 0;
    }

    public Stool(String color, int countLeg, String material, boolean idRoller) {
        this.color = color;
        this.countLeg = countLeg;
        this.material = material;
        this.idRoller = idRoller;
    }
}