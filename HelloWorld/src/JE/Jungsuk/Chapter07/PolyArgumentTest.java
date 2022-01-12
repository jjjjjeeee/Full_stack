package JE.Jungsuk.Chapter07;

class Product11{
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스 점수

    Product11(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
    }
}

class Tv extends Product11{
    Tv() {
        // 조상클래스의 생성자 Product(int price)를 호출
        super(100); // Tv의 가격을 100만원으로 함
        }
        // Object클래스의 toString()을 오버라이딩함
        public String toString() { return "Tv";}
    }

class Computer1 extends Product11{
    Computer1() {super(200);}
    public String toString() { return "Computer1";}
}

class Buyer { // 고객, 물건을 사는 사람
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스점수

    void buy(Product11 p){
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없음");
            return;
        }
        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺌
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가
        System.out.println(p+"을/를 구입하셨습니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer1());

        System.out.println("현재 남은 돈은"+b.money+"만원입니다.");
        System.out.println("현재 보너스 점수는"+b.bonusPoint+"점입니다.");
    }
}

