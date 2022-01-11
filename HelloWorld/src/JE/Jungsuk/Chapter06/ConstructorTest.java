package JE.Jungsuk.Chapter06;

class Data1{
    int value;
}

class Data2{
    int value;

    Data2(int x) { // 매개변수가 있는 생성자
        value = x;
    }
}

public class ConstructorTest {
    // 생성자: 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        // Data2 d2 = new Data2();  // compile error 발생
        Data2 d2 = new Data2(10);
    }
}

// 기본 생성자가 컴파일러에 의해서 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 때
