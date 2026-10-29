package com.lecture.four.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players;
    private int maxPlayers;
    
    public Team(String teamName, int maxPlayers) {
        this.teamName = teamName;
        this.maxPlayers = maxPlayers;
        this.players = new ArrayList<>();
        System.out.println("Team created: " + teamName);
    }
    
    // Player is created outside and passed in - aggregation
    public boolean addPlayer(Player player) {
        if (players.size() < maxPlayers) {
            players.add(player);
            System.out.println(player.getName() + " joined " + teamName);
            return true;
        }
        System.out.println("Team is full");
        return false;
    }
    
    public void removePlayer(Player player) {
        if (players.remove(player)) {
            System.out.println(player.getName() + " left " + teamName);
        }
    }
    
    public void listPlayers() {
        System.out.println("\n" + teamName + " Roster:");
        if (players.isEmpty()) {
            System.out.println("  No players");
        } else {
            for (Player player : players) {
                System.out.println("  - " + player.getInfo());
            }
        }
    }
    
    public void playMatch() {
        System.out.println("\n" + teamName + " is playing:");
        for (Player player : players) {
            player.play();
        }
    }
    
    public String getTeamName() {
        return teamName;
    }
}
