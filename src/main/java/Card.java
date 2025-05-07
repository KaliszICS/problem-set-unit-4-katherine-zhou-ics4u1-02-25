public class Card{
    private String name;
    private String suit;
    private int value;

    public Card(String name, String suit, int value){
        this.name = name;
        this.suit = suit;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public String getSuit(){
        return this.suit;
    }

    public int getValue(){
        return this.value;
    }

    public String toString( ){
        return this.name + " of " + this.suit;
    }

    public boolean equals (Object obj){
        Card cow = (Card) obj;
        if (card.getName().equals(this.name)&& crd.getSuit()== this.suit && card.getValue()==this.value){
            return true;
        }
        return false;
}
}

