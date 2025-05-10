/**
 * 
 * The player class is the player in the game with a name, age, and hands
 * 
 * @author Katherine Zhou
 * @version 17.0.1
 */


public class Player{

    //instance variables
    private String name;
    private int age;
    private Card[] hand;

    /**
     * Takes a name, age, and array of cards which should be assigned to the hand
     * @param name is the name of player
     * @param age is the age of player
     * @param hand the cards in the player's hand
     */
    public Player(String name, int age, Card[] hand){
        this.name = name;
        this.age = age;
        if (hand != null){
            this.hand = new Card[hand.length];
            for (int i = 0; i < hand.length; i++){
                this.hand[i] = hand[i];
            }
        }
        else{
            this.hand = new Card[0];
        }
    }
    /**
     * Takes a name and age while creating a default empty hand of cards
     * @param name is the name of the player
     * @param age is the age of the player
     */
    public Player(String name, int age){
        this.name = name;
        this.age = age;
        this.hand = new Card[0];
    }
    /**
     * returns the name of the player
     * @return returns the name of the player
     */
    public String getName(){
        return this.name;
    }
    /**
     * returns the age of the player
     * @return returns the age of the player
     */
    public int getAge(){
        return this.age;
    }
    /**
     * returns the cards in the player's hand
     * @return returns the player's hand
     */
    public Card[] getHand(){
        return this.hand;
    }
    /**
     * returns the number of cards in the player's hand
     * @return returns the size of the player's hand
     */
    public int size(){
        return this.hand.length;
    }
    /**
     * Adds a card from the deck to the hand of the player
     * @param deck the deck that the card is taken from
     */
    public void draw(Deck deck){
        Card card = deck.draw();
        if (card == null){
            return;
        }
        Card[] newHand = new Card[this.hand.length + 1];
        for (int i = 0; i < this.hand.length; i++){
            newHand[i] = this.hand[i];
        }
        newHand[this.hand.length] = card;
        this.hand = newHand;
    }
    /**
     * Discards a card from the hand to the given deck's discard pile
     * Returns true if the card exists in hand, false otherwise
     * @param card is the card that will be discarded
     * @param discardPile is the pile the card will be discarded into
     * @return returns true if the card exists and was discarded, false otherwise
     */
    public boolean discardCard(Card card, DiscardPile discardPile){
        if (card == null || this.hand.length == 0){
            return false;
        }
        for (int i = 0; i < this.hand.length; i++){
            if (this.hand[i].equals(card)){
                discardPile.addCard(card);
                Card[] newHand = new Card[this.hand.length - 1];
                for (int a = 0, b = 0; a < this.hand.length; a++){
                    if (a != i){
                        newHand[b++] = this.hand[a];
                    }
                }
                this.hand = newHand;
                return true;
            }
        }
        return false;
    }
    /**
     * Returns the specified card to the deck
     * Returns true if the card exists in hand, false otherwise
     * @param card is the card that will be returned to the deck
     * @param deck is the deck the card will be returned to
     * @return returns true if the card exists and was returned, false otherwise
     */
    public boolean returnCard(Card card, Deck deck){
        //null cases
        if (card == null || this.hand.length == 0){
            return false;
        }
        for (int i = 0; i < this.hand.length; i++){
            if (this.hand[i].equals(card)){
                deck.addCard(card);
                Card[] newHand = new Card[this.hand.length - 1];
                for (int a = 0, b = 0; a < this.hand.length; a++){
                    if (a != i){
                        newHand[b++] = this.hand[a];
                    }
                }
                this.hand = newHand;
                return true;
            }
        }
        return false;
    }
    /**
     * Will print out their name, age, and hand of cards
     * @return returns the player's name, age, and hand of cards (eg. "Mr. Kalisz, 99, Ace of hearts, King of Hearts, Queen of Hearts, Jack of Hearts, 9 of Spades")
     */
    public String toString(){
        String person = this.name + ", " + this.age;
        if (this.hand.length == 0){
            return person;
        }
        for (int i = 0; i < this.hand.length; i++){
            person += ", " + this.hand[i].toString();
        }
        return person;
    }
}




























































