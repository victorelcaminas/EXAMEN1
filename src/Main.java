public class Main {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        for (int i = 0; i < 48; i++) {
            System.out.println(d.extractCard());
        }
    }
}
