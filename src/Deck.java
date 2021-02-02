public class Deck {

    private Card[] cards;

    public Deck() {
        cards = new Card[48];
        int count = 0;
        for (int suit = 1; suit <= 4; suit ++) {
            for (int n = 1; n <= 12; n++) {
                cards[count] = new Card(n, suit);
                count ++;
            }
        }
    }

}
