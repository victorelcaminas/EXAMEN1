public class Card {
    private int number;
    private int suit;

    public static final int OROS = 1;
    public static final int COPAS = 2;
    public static final int ESPADAS = 3;
    public static final int BASTOS = 4;

    public Card(int number, int suit) {
        this.number = number;
        this.suit = suit;
    }
}
