package com.company;

public class Player {
    private char playerToken;
    private String name;

    // Constructor
    public Player(char playerToken, String name) {
        this.playerToken = playerToken;
        this.name = name;
    }

    // Get the current player's name
    public String getName() {
        return this.name;
    }

    //Get the current player's Token
    public char getPlayerToken() {
        return this.playerToken;
    }
}
