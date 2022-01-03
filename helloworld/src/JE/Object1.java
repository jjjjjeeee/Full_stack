package JE;

// 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직
// 하나의 소스파일에는 하나의 public class만 허용
public class Object1 {
    // 객체 = 속성(변수) + 기능(메서드)
    // 클래스 => 설계도, 객체를 생성하기 위해 필요
    public static void main(String[] args) {
        Tv t = new Tv();  // Tv인스턴스 생성
        t.channel = 7;    // Tv인스턴스의 멤버변수의 값을 7로 설정
        t.channelDown();  // Tv인스턴스의 메서드 channelDown()을 호출
        System.out.println("현재 채널: "+t.channel);
    }
}

class Tv{
    // Tv의 속성(멤버변수)
    String color;  // 인스턴스 변수 => iv, static+iv == lv(클래스 변수)
    boolean power;
    int channel;

    // Tv의 기능(메서드)
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}


// 클래스
// 1) 설계도
// 2) 데이터 + 함수
// 3) 사용자 정의 타입

// 공통속성은 cv