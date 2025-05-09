/**
 * The Card class a playing card from a standard deck of cards excluding the Joker
 * Includes the name, suit, and value of the card
 * @author Katherine Zhou
 * @version 17.0.1
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
    public Card(String name, String suit, int value){
        this.name = name;
        this.suit = suit;
        this.value = value;
    }
    /**
     * returns the name of the card
     * @return returns the name of the card (eg. "Queen")
     */

    public String getName(){
        return this.name;
    }
        /**
     * returns the suit of the card
     * @return returns the suit of the card (eg. "club")
     */


    public String getSuit(){
        return this.suit;
    }
        /**
     * returns the value of the card
     * @return returns the value of the card (eg. 1 for ace)
     */


    public int getValue(){
        return this.value;
    }

    /**
     * returns the full name of the card
     * @return returns the full name of the card(eg. "Queen of Hearts" if the name is Queen and the suit is hearts)
     */

    public String toString( ){
        return this.name + " of " + this.suit;
    }
    /**
     * checks to see if obj is equal to card
     * @param compares obj with the card, returns true if both cards are the same, false otherwise (eg. "Queen, Hearts, 12" & "Queen, Hearts, 12" returns true)
     */

    public boolean equals (Object obj){
        Card card = (Card) obj;

        if (card.getName().equals(this.name)&& card.getSuit()== this.suit && card.getValue()==this.value){
            return true;
        }
        return false;
}
}

