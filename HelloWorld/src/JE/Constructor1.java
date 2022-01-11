package JE;

public class Constructor1 {
    public static void main(String[] args) {
    // 생성자 => 인스턴스 초기화, 클래스 이름과 동일해야 함, 리턴값 없음
    // 생성자는 앞에 void 안붙음
        Car car = new Car();
        String color = "빨간색";
        System.out.println("차 색깔은:"+color);
    }
}

class Car{
    String color;
    String gearType;
    int door;

    Car() {} // 매개변수 없는 생성자 == 기본 생성자
    Car(String c, String g, int d){  // 매개변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }

    Car(String color){
        this(color,"auto",4);
    }
}

// 참조변수 this != 생성자 this() 
