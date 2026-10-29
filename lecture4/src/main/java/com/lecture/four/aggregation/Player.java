package com.lecture.four.aggregation;

//Team contains Players
public class Player {
    private String name;
    private int jerseyNumber;
    private String position;
    
    public Player(String name, int jerseyNumber, String position) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        System.out.println("Player created: " + name);
    }
    
    public void play() {
        System.out.println(name + " is playing as " + position);
    }
    
    public void train() {
        System.out.println(name + " is training");
    }
    
    public String getName() {
        return name;
    }
    
    public String getInfo() {
        return name + " (#" + jerseyNumber + ") - " + position;
    }
}