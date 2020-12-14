package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // PLayers init
            Player player1 = new Player('X', "Joueur1");
            Player player2 = new Player('O', "Joueur2");
        // Board game init
            Grid grid1 = new Grid("5", 5, new char [] {'1','2','3','4','5','6','7','8','9'});

        // Game launch
            System.out.println("Bienvenue dans le jeu du Morpion. Ce jeu se joue avec deux joueurs \n" +
                "sur une grille d’une dimension de 3 x 3. Le joueur 1 joue avec \n" +
                "les croix (X) et joue en premier et le joueur 2 joue avec les ronds (O).");

            System.out.println("\nLe quadrillage du morpion apparaît de cette manière au début du jeu.");
            grid1.printGrid();
            System.out.println("A tour de rôle, le joueur doit choisir un emplacement disponible \n" +
                    "en entrant un chiffre disponible entre 1 et 9. Le chiffre sera remplacé par \n" +
                    "le symbole du joueur. Le but du jeu est d’aligner trois mêmes symboles. A vous de jouer ! \n");
        //Player's turn
            boolean hasWon = false;
            int counter = 0;

            while(!hasWon) {
                //Player 1
                if (counter % 2 == 0 && hasWon == false) {
                    grid1.printGrid();
                    System.out.println("Player 1, your turn :");
                    grid1.launchInput(player1.getPlayerToken());
                    counter++;
                    //Condition de victoire
                    if (grid1.checkVictory()) {
                        grid1.printGrid();
                        hasWon = true;
                        System.out.println("Player 1, you are the winner !");
                    };
                }
                //PLayer 2
                if (counter % 2 == 1 && hasWon == false && counter < 8) {
                    grid1.printGrid();
                    System.out.println("Player 2, your turn :");
                    grid1.launchInput(player2.getPlayerToken());
                    counter++;
                    //Condition de victoire
                    if (grid1.checkVictory()) {
                        grid1.printGrid();
                        hasWon = true;
                        System.out.println("Player 2, you are the winner !");
                    };
                }
                if (counter == 9) {
                    System.out.println("No one has won !");
                    hasWon = true;
                }
            }
    }
}
