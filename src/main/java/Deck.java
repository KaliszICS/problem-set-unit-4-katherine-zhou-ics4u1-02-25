import java.util.Random;

public class Deck{
    private Card[] deck;

	public Deck(Card[] deck) {
		if (deck != null) {
			this.deck = new Card[deck.length];
			for (int i = 0; i < deck.length; i++) {
				this.deck[i] = deck[i];
			}
		} 
		else {
			this.deck = new Card[0];
		}
	}
	public Deck() {
		String[] suits = {"hearts", "clubs", "diamonds", "spades"};
		String[] name = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		this.deck = new Card[52];
		int num = 0;

		for (int i = 0; i < suits.length; i++) {
			for (int a = 0; a < name.length; a++) {
				this.deck[num] = new Card(name[a], suits[i], value[a]);
				num++;
			}
		}
	}
	public int size() {
		return this.deck.length;
	}

	public Card draw() {
		if (this.deck.length == 0) {
			return null;}

		Card top = this.deck[0];
		Card[] newCard = new Card[this.deck.length - 1];
		for (int i = 1; i < this.deck.length; i++){
			newCard[i - 1] = this.deck[i];
		} 

		this.deck = newCard;
		return top;
	}

	public void shuffle() {
		Random random = new Random();

		for (int i = this.deck.length - 1; i > 0; i--) {
			int next = random.nextInt(i + 1);
			Card hold = this.deck[i];
			this.deck[i] = this.deck[next];
			this.deck[next] = hold;
		}
	}
}