/**
 * The Card class a playing card from a standard deck of cards excluding the Joker
 * Includes the name, suit, and value of the card
 * @author Katherine Zhou
 * @version 
 * 
 */

public class Card{

    //instance variables
    private String name;
    private String suit;
    private int value;

    /**
     * assigns a name, suit, and value to a card
     * @param name name of the card (eg.Ace, 2, 3, Queen)
     * @param suit suit of the card (eg. Heart, Spade, Diamond, Club)
     * @param value value of the card (eg.A = 1, 2 = 2, Queen = 12)
     */
    //contructor
    public Card(String name, String suit, int value){
        this.name = name;
        this.suit = suit;
        this.value = value;
    }
    //methods- params and return
    /**
     * 
     * @return returns the name of the card
     */

    public String getName(){
        return this.name;
    }
        /**
     * 
     * @return returns the suit of the card
     */


    public String getSuit(){
        return this.suit;
    }
        /**
     * 
     * @return returns the value of the card
     */


    public int getValue(){
        return this.value;
    }

    /**
     * The full form of the card
     * @return returns the full form of the card(eg. "Queen of Hearts" if the name is Queen and the suit is hearts)
     */

    public String toString( ){
        return this.name + " of " + this.suit;
    }
    /**
     * checks to see if two cards are the same
     * @ Checks if the name, suit, and value of two cards are the same (eg. "Queen, Hearts, 12" & "Queen, Hearts, 12" returns true)
     */

    public boolean equals (Object obj){
        Card card = (Card) obj;

        if (card.getName().equals(this.name)&& card.getSuit()== this.suit && card.getValue()==this.value){
            return true;
        }
        return false;
}
}

