package com.lecture.four.composition;

public class Transmission {
    private String name;
    private int gears;
    
    public Transmission(String name, int gears) {
        this.name = name;
        this.gears = gears;
        System.out.println("Transmission created: " + name);
    }
    
    public void shiftGear(int gear) {
        if (gear >= 1 && gear <= gears) {
            System.out.println("Shifting to gear " + gear);
        } else {
            System.out.println("Invalid gear!");
        }
    }
    
    public String getType() {
        return name;
    }
}