

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patrickcozzi
 */
public class driver 
{

    public static void main(String[] args) 
    {
        Deck fullDeck = Deck.getFullDeck();
        fullDeck.shuffle();
        fullDeck.print();
        fullDeck.deal();
        
        
        
    }
    
}
