package JE.Jungsuk.Chapter06;

public class CallStackTest {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작됨");
        firstMethod();
        System.out.println("main(String[] args)이 끝났음");

    }

    static void firstMethod() {
        secondMethod();
        System.out.println("XXXXX");
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
        System.out.println("OOOOO");
    }
}
