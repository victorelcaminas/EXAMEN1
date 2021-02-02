import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
        String[] lines = new String[4];
        Boolean[] first = new Boolean[4];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = "";
            first[i] = true;
        }
        for (int i = 0; i <= nextCard; i++) {
            int index = cards[i].getSuit() - 1;
            if (first[index]) {
                first[index] = false;
            } else {
                lines[index] += ", ";
            }
            lines[index] += cards[i];
        }
        for (int i = 0 ; i < lines.length; i++) {
            s += lines[i] + "\n";
        }
        return s;
    }

    public String toString2() {
        String oros = "", copas = "", espadas = "", bastos = "";
        for (Card c: cards) {
            switch (c.getSuit()) {
                case Card.OROS:
                    oros += c + ", ";
                    break;
                case Card.COPAS:
                    copas += c + ", ";
                    break;
                case Card.ESPADAS:
                    espadas += c + ", ";
                    break;
                case Card.BASTOS:
                    bastos += c + ", ";
                    break;
            }
        }
        return oros + "\n" + copas + "\n" + espadas + "\n" + bastos + "\n";
    }

    public void writeToFile(String fileName) throws IOException {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(fileName));
            out.println("number,suit");
            for (int i = 0; i <= nextCard; i++) {
                int num = cards[i].getNumber();
                int suit = cards[i].getSuit();
                out.println(num + "," +suit);
            }
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }
}
