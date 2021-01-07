package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // Board game init
    static Grid boardGame = new Grid();

    public static void main(String[] args) {
        // Game setup
            // PLayers init with custom pseudo
            System.out.println("Hello, what's the first player's name ?");
            Player player1 = new Player('X', askPlayerName());

            System.out.println("What's the second player's name ?");
            Player player2 = new Player( 'O', askPlayerName());

            // Welcome message
            System.out.println("\nWelcome to Tic Tac Toe, " + player1.getName() + " and " + player2.getName() + ".\n");

            // Rules
            System.out.println("This is a two players game with a 3x3 grid.\n" +
                "First player will play with the CROSS (X) while the second one will\n" +
                "have the CIRCLE (O). The first player will be randomly chosen so, be vigilant !\n");

            System.out.println("At the beginning, the board game will be printed like that : \n");
            boardGame.printGrid();

            System.out.println("\n At each turn, player will choose an available number on the grid to insert his token\n" +
                    "by entering a number between 1 and 9. And voilà, this case is now yours !\n" +
                    "To win at this game, you need to align 3 of your Token before your opponent. So, here we go !\n");

            //Game launch
            boardGame.printGrid();
            //Player turn
            String currentPlayer = randomFirstPlayer(player1.getName(), player2.getName());
            System.out.println("\nTic Tac toe has decided that the first player will be... " + currentPlayer);
            do {
                if (currentPlayer.equals(player1.getName())) {
                    currentPlayer = player2.getName();
                    System.out.println(player1.getName() + " , it's your turn.");
                    launchInput(player1.getPlayerToken());
                } else {
                    System.out.println(player2.getName() + " , it's your turn.");
                    currentPlayer = player1.getName();
                    launchInput(player2.getPlayerToken());
                }
            } while (!boardGame.checkVictory());
            System.out.println(currentPlayer + " has won the game !");
    }

    /**
     * Method to ask player's name
     * @return player name
     */
    public static String askPlayerName() {
            Scanner playerNameInput = new Scanner(System.in);
            return playerNameInput.nextLine();
    }

    /**
     * Method to choose randomly the first player
     * @param player1Name First player name
     * @param player2Name Second player name
     * @return the player who will play in first position
     */
    public static String randomFirstPlayer(String player1Name, String player2Name) {
        int[] players = new int[2];
        int randomPlayer = new Random().nextInt(players.length);
        if (randomPlayer == 1) {
            return player1Name;
        }
        return player2Name;
    }

    /**
     * Method to launch and check if the input is valid
     * @param playerToken Number (1 - 9) the player has entered
     */
    public static void launchInput(char playerToken) {
        // Check if the input is a number
        boolean isValid = false;
        while(!isValid) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Choose a number between 1 to 9 :");
                // retrieve input field (input.nextLine())
                int userNumberChoice = input.nextInt();
                // Check if the number is between 1 and 9
                if (userNumberChoice < 1 || userNumberChoice > 9) {
                    System.out.println("Sorry, you need to choose a number between 1 and 9.");
                } else {
                    isValid = true;
                    boardGame.addToken(userNumberChoice, playerToken);
                    boardGame.printGrid();
                }
            } catch (InputMismatchException exception) {
                System.out.println("Sorry, I can't deal with characters !");
            }
        }
    }
}
