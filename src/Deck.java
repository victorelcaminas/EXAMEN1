public class Deck {

    private Card[] cards;
    private int nextCard;

    public Deck() {
        cards = new Card[48];
        int count = 0;
        for (int suit = 1; suit <= 4; suit ++) {
            for (int n = 1; n <= 12; n++) {
                cards[count] = new Card(n, suit);
                count ++;
            }
        }
        nextCard = 47;
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int aleat = (int) (Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[aleat];
            cards[aleat] = temp;
        }
        /* for (int i = 0; i < 10000; i++) {
            int alea1 = (int) (Math.random() * cards.length);
            int alea2 = (int) (Math.random() * cards.length);
            Card temp = cards[alea1];
            cards[alea1] = cards[alea2];
            cards[alea2] = temp;
        } */
    }

    public Card extractCard() {
        // return cards[nextCard--];
        Card c = cards[nextCard];
        nextCard --;
        return  c;
    }

    @Override
    public String toString() {
        String s = "";
        for (Card c: cards) {
            s += c + "\n";
        }
        return s;
    }

}
