package JE;

public class Card {

    public static void main(String[] args) {
    // cv는 객체 생성없이 사용 가능
    // 공통 속성일 경우 cv사용
    System.out.println("클래스 변수 입니다. 객체 생성없이 사용이 가능합니다.");
    System.out.println("Card.width = " + Card.width1); // 클래스 변수는 객체 생성없이 사용이 가능하다.
    System.out.println("Card.height = " + Card.height1);
    System.out.println("------------------------");

    System.out.println("인스턴스 변수 입니다. 객체를 반드시 생성해서 클래스의 멤버에 접근이 가능합니다.");
    Card c1 = new Card();
    c1.kind1 = "Heart";
    c1.number1 = 7;

    Card c2 = new Card();
    c2.kind1 = "Spade";
    c2.number1 = 4;
    System.out.println("------------------------");
    System.out.println("c1은 " + c1.kind1 + ", " + c1.number1 + "이며, 크기는 (" + c1.width1 + ", " + c1.height1 + ")");
    System.out.println("c2는 " + c2.kind1 + ", " + c2.number1 + "이며, 크기는 (" + c2.width1 + ", " + c2.height1 + ")");
    System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
    c1.width1 = 50;
    c1.height1 = 80;

    System.out.println("c1은 " + c1.kind1 + ", " + c1.number1 + "이며, 크기는 (" + c1.width1 + ", " + c1.height1 + ")");
    System.out.println("c2는 " + c2.kind1 + ", " + c2.number1 + "이며, 크기는 (" + c2.width1 + ", " + c2.height1 + ")");
    System.out.println("c2의 width와 height를 변경한 적 없지만 공통적으로 변경되어 있는 것을 알 수 있습니다.");
    }
}

class Card1{
    String kind1;             // 인스턴스 변수
    int number1;              // 인스턴스 변수
    static int width1 = 100;  // 클래스 변수
    static int height1 = 250; // 클래스 변수
}