package com.patrickcozzi;

import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author patrickcozzi
 */
public class Player {

    private Queue<Card> hand;
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = new LinkedList<>();
    }

    /**
     * Gives the player a card, which is added to back of the players hand.
     */
    public void giveCard(Card newCard) {
        this.hand.offer(newCard);
    }

    /**
     * Draws and returns a card from the top of the player's hand.
     *
     * @return The players next card, or null if the player has no more cards.
     */
    public Card drawCard() {
        return this.hand.poll();
    }

    /**
     * The number of cards in the players hand.
     */
    public int cardCount() {
        return this.hand.size();
    }

    public String getName() {
        return name;
    }

    /**
     * For debugging purposes, prints the player's current hand of cards.
     */
    public void printHand() {
        System.out.printf("PRINTING HAND FOR '%s':\n", this.name);
        for (Card c : this.hand) {
            System.out.println(c);
        }
    }

}
