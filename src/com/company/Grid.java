package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Grid {
    private String input;
    private int gridCell;
    private char[] grid;


    public Grid(String input, int gridCell, char[] grid) {
        this.input = input;
        this.gridCell = gridCell;
        this.grid = grid;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getGridCell() {
        return gridCell;
    }

    public void setGridCell(int gridCell) {
        this.gridCell = gridCell;
    }

    public char[] getGrid() {
        return grid;
    }

    /*public void setGrid(char[] grid) {
        this.grid = grid;
    }*/
    private void setGrid(char playerToken) {
        this.grid = grid;
    }

    // Method to launch and check if the input is valid
    public void launchInput(char playerToken) {
        // Check if the input is a number
        boolean isValid = false;
        while(!isValid) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Choose a number between 1 to 9");
                // retrieve input field (input.nextLine())
                int userChoice = input.nextInt();
                // Check if the number is between 1 and 9
                if (userChoice < 1 || userChoice > 9) {
                    System.out.println("Oops ! You made an error. Please choose a number between 1 and 9");
                } else {
                    isValid = true;
                    addToken(userChoice, playerToken);
                }
            } catch (InputMismatchException exception) {
                System.out.println("Please use a valid number");
            }
        }
    }
    // Method to add player's input to the grid
    public void addToken(int gridIdx, char playerToken) {
        // change gridIdx by the Player token
        if (grid[gridIdx - 1] != 'X' && grid[gridIdx - 1] != 'O') {
            grid[gridIdx - 1] = playerToken;
            setGrid(playerToken);
        }
            else {
                System.out.println("Error, this number is already used !");
                launchInput(playerToken);
        }
    }

    // Method to check Winner
    public boolean checkVictory() {
        if (getGrid()[0] == 'X' && getGrid()[1] == 'X' && getGrid()[2] == 'X' || getGrid()[0] == 'O' && getGrid()[1] == 'O' && getGrid()[2] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (getGrid()[3] == 'X' && getGrid()[4] == 'X' && getGrid()[5] == 'X' || getGrid()[3] == 'O' && getGrid()[4] == 'O' && getGrid()[5] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (getGrid()[6] == 'X' && getGrid()[7] == 'X' && getGrid()[8] == 'X' || getGrid()[6] == 'O' && getGrid()[7] == 'O' && getGrid()[8] == 'O') {
            System.out.println("Victory !");
            return true;
        }else if (getGrid()[0] == 'X' && getGrid()[3] == 'X' && getGrid()[6] == 'X' || getGrid()[0] == 'O' && getGrid()[3] == 'O' && getGrid()[6] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (getGrid()[1] == 'X' && getGrid()[4] == 'X' && getGrid()[7] == 'X' || getGrid()[1] == 'O' && getGrid()[4] == 'O' && getGrid()[7] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (getGrid()[2] == 'X' && getGrid()[5] == 'X' && getGrid()[8] == 'X' || getGrid()[2] == 'O' && getGrid()[5] == 'O' && getGrid()[8] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (getGrid()[0] == 'X' && getGrid()[4] == 'X' && getGrid()[8] == 'X' || getGrid()[0] == 'O' && getGrid()[4] == 'O' && getGrid()[8] == 'O') {
            System.out.println("Victory !");
            return true;
        } else if (getGrid()[2] == 'X' && getGrid()[4] == 'X' && getGrid()[6] == 'X' || getGrid()[2] == 'O' && getGrid()[4] == 'O' && getGrid()[6] == 'O') {
            System.out.println("Victory !");
            return true;
        }
        return false;
    }

    // Method to print player's symbol into the Grid
    public void printGrid() {
        System.out.println("|---|---|---|");
        System.out.println("| "+ grid[0] + " | " + grid[1] + " | " + grid[2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| "+ grid[3] + " | " + grid[4] + " | " + grid[5] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| "+ grid[6] + " | " + grid[7] + " | " + grid[8] + " |");
        System.out.println("|---|---|---|");

    }



}
