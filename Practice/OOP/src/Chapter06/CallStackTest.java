package Chapter06;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod(); // static메서드는 객체 생성없이 호출가능
    }

    private static void firstMethod() {
        secondMethod();
    }

    private static void secondMethod() {
        System.out.println("secondMethod");
    }
}