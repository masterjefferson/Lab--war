package com.patrickcozzi;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author patrickcozzi
 */
public class driver {

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Welcome to WAR!");
        Player playerOne = awaitPlayer(1, consoleInput);
        Player playerTwo = awaitPlayer(2, consoleInput);
        WarGame game = new WarGame(playerOne, playerTwo);
        game.play();
    }

    /**
     * Waits for console input for the player name and then returns the player.
     *
     * @param playerNumber The player number (for printing purposes)
     * @param input The Scanner to read from
     * @return A new player with name from user input
     */
    private static Player awaitPlayer(int playerNumber, Scanner input) {
        System.out.printf("Enter name for player %d > ", playerNumber);
        String name = input.nextLine();
        return new Player(name);
    }

}
