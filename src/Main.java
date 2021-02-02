public class Main {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        Card c = d.extractCard();
        System.out.println(c);
        System.out.println(d.toString());
    }
}
