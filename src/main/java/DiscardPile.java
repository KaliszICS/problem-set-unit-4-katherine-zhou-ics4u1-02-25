public class DiscardPile{
    private Card[] pile;

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
    public DiscardPile(){
        this.pile = new Card[0];
    }
    public Card[] getpile(){
        return this.pile;
    }

    public int size(){
        return this.pile.length;
    }
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

    public Card[] removeAll(){
        if (this.pile.length == 0){
            return new Card[0];
        }

        Card[] removedCards = this.pile;
        this.pile = new Card[0];
        return removedCards;
    }
    public String toString(){
        if (this.pile.length == 0){
            return "";
    }
        String hand = "";
    
        for (int i = 0; i < this.pile.length; i++){
            hand += this.pile[i].toString();
        
            if (i != this.pile.length - 1){ 
                hand += ", ";
        }
    }

        return hand;
}
}
