package JE.Jungsuk.Chapter06;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = "+Card.width);
        System.out.println("Card.height = "+Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "spade";
        c2.number = 3;

        System.out.println(c1.kind+c1.number+c1.width+Card.height);
        System.out.println(c2.kind+c2.number+c2.width+c2.height);
    }
}

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}