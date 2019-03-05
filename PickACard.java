class Card {
    int value; 
    String suit;
    String name;

    Card(int _value, String _suit, String _name){
        value = _value;
        suit = _suit;
        name = _name;
    }

    public String toString() {
        return name + " of " + suit;
    }
}

public class PickACard {
    public static void main( String[] args){
        Card[] deck = buildDeck();
        // displayDeck(deck);

        int chosen = (int)Math.random() * deck.length;
        Card picked = deck[chosen];

        System.out.println("You picked a " + picked + " out of the deck,");
        System.out.println("worth " + picked.value + " points in Blackjack.");
    }

    public static Card[] buildDeck() {
        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        String[] names = {"ZERO", "ONE", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};

        int i = 0;
        Card[] deck = new Card[52];
        for(String s : suits){
            for(int v = 2; v <= 14; v++){
                int value;
                if (v == 14)
                    value = 11;
                else if (v > 10)
                    value = 10;
                else 
                    value = v;
                deck[i] = new Card(value, s, names[v]);
                i++;
            }
        }
        return deck;
    }

    public static void displayDeck(Card[] deck){
        for (Card c: deck)
            System.out.println(c.value + "\t" + c);
    }
}