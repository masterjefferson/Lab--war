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
public class Card {
    
    public enum SUIT  {
        HEARTS, DIAMONDS, SPADES, CLUBS
    }
    
    private int value;
    private SUIT suit;
    
    public Card(SUIT suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SUIT getSuit() {
        return suit;
    }

    public void setSuit(SUIT suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%d of %s", this.value, this.suit.name());
        
    }
    
    
    
}
