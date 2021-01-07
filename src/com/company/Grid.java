package com.company;

import java.util.Scanner;

public class Grid {
    private String input;
    private char[] grid;


    public Grid() {
        this.grid = new char[]{'1','2','3','4','5','6','7','8','9'};
    }

    /**
     * Method to add player's Token to the grid
     * @param userNumberInput Grid's index referring to the player's choice number
     * @param playerToken The player's token ('X' or 'O')
     */
    public void addToken(int userNumberInput, char playerToken) {
            while (this.grid[userNumberInput - 1] == 'X' || this.grid[userNumberInput - 1] == 'O') {
                System.out.println("Error, this number is already used !");
                System.out.println("Please choose a available space in the grid.");
                Scanner askAgain = new Scanner(System.in);
                userNumberInput = askAgain.nextInt();
            }
        this.grid[userNumberInput - 1] = playerToken;
    }

    /**
     * Method to check Winner
     * @return Return 'True' to stop the round
     */
    public boolean checkVictory() {
        if (this.grid[0] == 'X' && this.grid[1] == 'X' && this.grid[2] == 'X' || this.grid[0] == 'O' && this.grid[1] == 'O' && this.grid[2] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (this.grid[3] == 'X' && this.grid[4] == 'X' && this.grid[5] == 'X' || this.grid[3] == 'O' && this.grid[4] == 'O' && this.grid[5] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (this.grid[6] == 'X' && this.grid[7] == 'X' && this.grid[8] == 'X' || this.grid[6] == 'O' && this.grid[7] == 'O' && this.grid[8] == 'O') {
            System.out.println("Victory !");
            return true;
        }else if (this.grid[0] == 'X' && this.grid[3] == 'X' && this.grid[6] == 'X' || this.grid[0] == 'O' && this.grid[3] == 'O' && this.grid[6] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (this.grid[1] == 'X' && this.grid[4] == 'X' && this.grid[7] == 'X' || this.grid[1] == 'O' && this.grid[4] == 'O' && this.grid[7] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (this.grid[2] == 'X' && this.grid[5] == 'X' && this.grid[8] == 'X' || this.grid[2] == 'O' && this.grid[5] == 'O' && this.grid[8] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (this.grid[0] == 'X' && this.grid[4] == 'X' && this.grid[8] == 'X' || this.grid[0] == 'O' && this.grid[4] == 'O' && this.grid[8] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (this.grid[2] == 'X' && this.grid[4] == 'X' && this.grid[6] == 'X' || this.grid[2] == 'O' && this.grid[4] == 'O' && this.grid[6] == 'O') {
            System.out.println("Victory !");
            return true;
        }
        return false;
    }

    /**
     * Method to print Grid in the console.
     */
    public void printGrid() {
        System.out.println("|---|---|---|");
        System.out.println("| "+ this.grid[0] + " | " + this.grid[1] + " | " + this.grid[2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| "+ this.grid[3] + " | " + this.grid[4] + " | " + this.grid[5] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| "+ this.grid[6] + " | " + this.grid[7] + " | " + this.grid[8] + " |");
        System.out.println("|---|---|---|");

    }



}
