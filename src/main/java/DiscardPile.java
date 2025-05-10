/**
 * The discard pile is a pile of cards that has been discarded in the game. 
 * Cards can be added, removed, and 
 * 
 * @author Katherine Zhou
 * @version 17.0.1
 */

public class DiscardPile{

    //instance variables
    private Card[] pile;
/**
 * This constructor takes in an array of cards and sets it as the discard pile
 * A pile will be created even if there are no cards (null)
 * @param cards the cards that are to be added to the discard pile
 */

    public DiscardPile(Card[] cards){
        this.pile = pile;
        if (cards != null){
            this.pile = new Card[cards.length];
            for (int i = 0; i < cards.length; i++){
                this.pile[i] = cards[i];
            }
        } 
        else{
            this.pile = new Card[0];
        }
    }
    /**
     * Generates empty card pile with no paramaters
     */
    public DiscardPile(){
        this.pile = new Card[0];
    }
    /**
     * returns the discard pile as an array of cards
     * @return returns the discard pile
     */
    public Card[] getpile(){
        return this.pile;
    }
    /**
     * returns the amount of cards in the discard pile
     * @return reutrns amount of cards in discard pile
     */

    public int size(){
        return this.pile.length;
    }
    /**
     * Adds the provided card into the discard pile
     * if there is no card, it doesn't do anything
     * @param card is the card that will be added
     */
     public void addCard(Card card){
        if (card == null) {
            return;
        }

        Card[] newPile = new Card[this.pile.length + 1];
        for (int i = 0; i < this.pile.length; i++) {
            newPile[i] = this.pile[i];
        }
        newPile[this.pile.length] = card;
        this.pile = newPile;
    }
    /**
     * Removes the specified card from the discard pile and returns it
     * If the card doesn't exist, it returns null
     * @param card is the card that will be removed
     * @return returns the removed card or null if theres no card
     */
    public Card removeCard(Card card){
        if (card == null || this.pile.length == 0){
            return null;
        }

        for (int i = 0; i < this.pile.length; i++){
            if (this.pile[i].equals(card)) {
                Card removedCard = this.pile[i];

                Card[] newPile = new Card[this.pile.length - 1];
                for (int a = 0, b = 0; a < this.pile.length; a++){
                    if (a != i) {
                        newPile[b++] = this.pile[a];
                    }
                }

                this.pile = newPile;
                return removedCard;
            }
        }
        return null;
    }
    /**
     * Returns an array of cards and removes them all from the discard pile
     * If there are no cards in the discard pile then it returns an empty Card array
     * @return returns an array of cards int he discard pile, returns an empty card array if there are no cards
     */

    public Card[] removeAll(){
        if (this.pile.length == 0){
            return new Card[0];
        }

        Card[] removedCards = this.pile;
        this.pile = new Card[0];
        return removedCards;
    }
    /**
     * returns all the cards in the order they were added into the discard pile
     * @return returns a list of the cards in the discard pile (eg. "Ace of hearts, King of Hearts, Queen of Hearts, Jack of Hearts, 9 of Spades")
     */
    public String toString(){
        if (this.pile.length == 0){
            return "";
    }
        String discard = "";
    
        for (int i = 0; i < this.pile.length; i++){
            discard += this.pile[i].toString();
        
            if (i != this.pile.length - 1){ 
                discard += ", ";
        }
    }

        return discard;
}
}
