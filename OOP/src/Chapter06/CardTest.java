package Chapter06;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width ="+ Card.width);
        System.out.println("Card.height ="+ Card.height);

        Card c1 = new Card();
        c1.kind = "diamond";
        c1.number = 3;

        Card c2 = new Card();
        c2.kind = "spade";
        c2.number = 7;

        System.out.println("c1 카드의 정보: "+c1.kind+"\t"+c1.number+"\t"+c1.width+"\t"+c1.height);
        System.out.println("c2 카드의 정보: "+c2.kind+"\t"+c2.number+"\t"+c2.width+"\t"+c2.height);
        
        c1.width = 70;
        c1.height = 100;

        System.out.println("변경된 카드의 정보: "+c1.kind+"\t"+c1.number+"\t"+c1.width+"\t"+c1.height);
        System.out.println("변경된 카드의 정보: "+c2.kind+"\t"+c2.number+"\t"+c2.width+"\t"+c2.height);

    }
}


class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}