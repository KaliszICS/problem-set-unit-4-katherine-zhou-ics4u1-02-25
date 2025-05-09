import java.util.Random;

/**
 * This class is a standard deck of card exculding the joker.
 * It checks the size of the deck, chacks the top card, and shuffles the deck.
 * @author Katherine Zhou
 * @version 17.0.1
 * 
 */

//instance variable
public class Deck{
    private Card[] deck;
	/**
	 * Array of cards that are set as the deck
	 * @param deck is an array of cards that are set as the deck
	 */

	public Deck(Card[] deck){
		this.deck=deck;
		if (deck != null) {
			this.deck = new Card[deck.length];
			for (int i = 0; i < deck.length; i++){
				this.deck[i] = deck[i];
			}
		} 
		else {
			this.deck = new Card[0];
		}
	}
	/**
	 * Makes a deck of unshuffled cards in this order:
	 * hearts, clubs, diamonds, spades, Ace to King
	 */
	public Deck(){
		String[] suits = {"hearts", "clubs", "diamonds", "spades"};
		String[] name = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		this.deck = new Card[52];
		int num = 0;

		for (int i = 0; i < suits.length; i++){
			for (int a = 0; a < name.length; a++){
				this.deck[num] = new Card(name[a], suits[i], value[a]);
				num++;
			}
		}
	}
	/**
	 * returns the number of cards that are in the deck
	 * @return the number of cards in the deck
	 */
	public int size(){
		return this.deck.length;
	}
/**
 * Draws the card at the top of the deck
 * @return the top card, returns null if the deck is empty
 */

	public Card draw(){
		if (this.deck.length == 0){
			return null;}

		Card top = this.deck[0];
		Card[] newCard = new Card[this.deck.length - 1];
		for (int i = 1; i < this.deck.length; i++){
			newCard[i - 1] = this.deck[i];
		} 

		this.deck = newCard;
		return top;
	}
/**
 * Shuffles the deck of cards
 * Order of cards is randomized
 */

	public void shuffle(){
		Random random = new Random();

		for (int i = this.deck.length - 1; i > 0; i--){
			int next = random.nextInt(i + 1);
			Card hold = this.deck[i];
			this.deck[i] = this.deck[next];
			this.deck[next] = hold;
		}
	}


	/**
	 * Adds the provided card back into the deck
	 * @param card is the provided card thats to be added back into the deck
	 */
    public void addCard(Card card){
        if (card == null){
            return;
        }

        Card[] newDeck = new Card[this.deck.length + 1];
        for (int i = 0; i < this.deck.length; i++){
            newDeck[i] = this.deck[i];
        }
        newDeck[this.deck.length] = card;
        this.deck = newDeck;
    }

	/**
	 * Adds all the cards in the card array back into the deck and shuffles after adding them
	 * Exits if there are no cards to add or if its null
	 */
	public void reshuffle(Card[] cards){
        if (cards == null || cards.length == 0){
            return;
        }
		/**
		 * The size of the deck will increase if there are cards to be added
		 */
        int Size = this.deck.length;
 		 for (int i = 0; i < cards.length; i++){
            if (cards[i] != null) {
                Size++;
            }
        }
		/**
		 * The new deck is stored in a new array
		 */

        Card[] newDeck = new Card[Size];
        int amount = 0;

    	for (int i = 0; i < this.deck.length; i++){
       		newDeck[amount] = this.deck[i];
        	amount++;
    }
    	for (int i = 0; i < cards.length; i++){
        	if (cards[i] != null) {
            	newDeck[amount] = cards[i];
            	amount++;
		/**
		 * deck now includes all added cards
		 * deck is shuffled
		 */
			}
		}
        this.deck = newDeck;
        this.shuffle();


}
}