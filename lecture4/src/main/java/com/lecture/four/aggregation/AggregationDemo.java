package com.lecture.four.aggregation;

public class AggregationDemo {
    public static void main(String[] args) {
        
        // Players exist independently
        Player player1 = new Player("Alice", 10, "Forward");
        Player player2 = new Player("Bob", 7, "Midfielder");
        Player player3 = new Player("Charlie", 1, "Goalkeeper");
        
        System.out.println();
        
        // Team contains players but doesn't own them
        Team teamA = new Team("Dragons", 11);
        teamA.addPlayer(player1);
        teamA.addPlayer(player2);
        teamA.addPlayer(player3);
        
        teamA.listPlayers();
        teamA.playMatch();
        
        System.out.println();
        
        // Player can leave team and join another
        teamA.removePlayer(player1);
        
        Team teamB = new Team("Tigers", 11);
        teamB.addPlayer(player1); // Same player, different team
        
        System.out.println();
        
        // Players still exist even if teams are destroyed
        teamA = null;
        System.out.println(player1.getName() + " still exists!");
        player1.train();
    }
}