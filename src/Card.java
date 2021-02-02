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

    @Override
    public String toString() {
        String numberStr = getNumberStr();
        String suitStr = getSuitStr();
        return numberStr + " de " + suitStr;
    }

    private String getNumberStr() {
        String s;
        switch (number) {
            case 10: s = "sota";
                        break;
            case 11: s = "caballo";
                        break;
            case 12: s = "rey";
                        break;
            default: s = "" + number;
        }
        return s;
    }

    public int getSuit() {
        return suit;
    }

    private String getSuitStr() {
        String s = "";
        switch (suit) {
            case OROS: s = "oros";
                    break;
            case COPAS: s = "copas";
                    break;
            case ESPADAS: s = "espadas";
                    break;
            case BASTOS: s = "bastos";
                    break;
        }
        return s;
    }

}
