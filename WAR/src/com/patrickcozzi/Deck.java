package com.patrickcozzi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patrickcozzi
 */
public class Deck {
    
    public static final int DECK_SIZE = 24;
    
    
    public static Deck getFullDeck() {
        List<Card> cards = new ArrayList<Card>(DECK_SIZE);
        for (Card.SUIT suit : Card.SUIT.values()) {
            for (int i = 5; i < 11; i++) {
                cards.add(new Card(suit, i));
        
            }
        }
        return new Deck(cards);
    } 
    
        
    
    private List<Card> cards;
    
    private Deck(List<Card> cards) {
        this.cards = cards;
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    /**
     * Removes one card from the deck and returns it.
     * @return The card at the "top" of the deck, or null if the deck is empty.
     */
    public Card drawCard() {
        if (!this.cards.isEmpty()) {
            return this.cards.remove(0);
        }
        return null;
    }
    
    public int cardCount() {
        return this.cards.size();
    }
    
    
    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
        
    }
    
}
    

