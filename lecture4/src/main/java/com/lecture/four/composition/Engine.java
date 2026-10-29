package com.lecture.four.composition;

public class Engine {

    private int horsepower;
    private String name;
    
    public Engine(int horsepower, String name) {
        this.horsepower = horsepower;
        this.name = name;
        System.out.println("Engine created: " + name);
    }
    
    public void start() {
        System.out.println("Engine started - " + horsepower + " HP");
    }
    
    public void stop() {
        System.out.println("Engine stopped");
    }
    
    public int getHorsepower() {
        return horsepower;
    }
}