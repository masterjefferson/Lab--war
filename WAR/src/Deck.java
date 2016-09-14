
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
    
    static final int DECK_SIZE = 24;
    
    
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
    
    public void deal() {
        List<Card> hand1 = new ArrayList(24);
        List<Card> hand2 = new ArrayList(24);
        hand1 = cards.subList(0,12);
        System.out.print (hand1);
        hand2 = cards.subList (12,24);
        
    }
    
    public  getHand1{
        
    }
    
    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
        
    }
    
        
        
        
        
    }
    

