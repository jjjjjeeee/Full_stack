package JE;

public class Static1 {
    // static 메서드는 인스턴스 변수(iv)를 사용할 수 없음
    int iv;  // 인스턴스 변수
    static int cv; // 클래스 변수

    void instanceMethod(){ // 인스턴스 메서드 => 객체 생성 후 호출 가능
        System.out.println(iv);
        System.out.println(cv);

    }
    static void staticMethod(){ // static 메서드
        System.out.println(iv); // 에러 => 인스턴스 변수를 사용할 수 없음
        System.out.println(cv); // 클래스 변수는 사용 가능
    }
}
