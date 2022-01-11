package JE.Jungsuk.Chapter06;

class Data {int x;}

// 반환타입이 '참조형'이라는 것은 메서드가 '객체의 주소'를 반환하는 것을 의미
public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x="+d.x);
        System.out.println("d2.x="+d2.x);
    }

    private static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }
}
