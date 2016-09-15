package com.patrickcozzi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author patrickcozzi
 */
public class WarGame {

    private final Player playerOne, playerTwo;
    private boolean gameOver;

    public WarGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.gameOver = false;
    }

    public void play() {
        System.out.printf(
                "Starting a war between '%s' and '%s'\n", 
                playerOne.getName(), 
                playerTwo.getName()
        );
        Deck deck = Deck.getFullDeck();
        deck.shuffle();
        givePlayerHand(deck, playerOne);
        givePlayerHand(deck, playerTwo);
        
        do {
            //TODO add game logic
            //for example:
            Card pOneCard = drawPlayerCard(playerOne);
            Card pTwoCard = drawPlayerCard(playerTwo);
            if (pOneCard.getValue() > pTwoCard.getValue()) {
                //do something
                //for now i'll just end it here
                gameOver = true;
            } else if (pOneCard.getValue() < pTwoCard.getValue()) {
                //do something else
            } else {
                //do the special thing
            }
        } while (!gameOver);

    }
    
    private Card drawPlayerCard(Player which) {
        Card card = which.drawCard();
        System.out.println(which.getName() + " draws " + card);
        return card;
    }
    
    private void givePlayerHand(Deck deck, Player player) {
        for (int i = 0; i < (Deck.DECK_SIZE / 2); i++) {
            player.giveCard(deck.drawCard());
        }
    }

}
