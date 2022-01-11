package JE.Jungsuk.Chapter07;

public class CastintTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car)fe;에서 형변환이 생략된 형태
        // car.water() // 에러발생, Car타입의 참조변수로는 water()호출불가
        fe2 = (FireEngine)car; // 자손타입 <- 조상타입
        fe2.water();
        fe.airbag();
    }
}

class Car{
    String color;
    int door;

    void drive(){ // 운전하는 기능
        System.out.println("drive~~~");}
    void stop(){ // 멈추는 기능
        System.out.println("stop!");}
    void airbag(){ // 운전하는 기능
        System.out.println("oh");}
}

class FireEngine extends Car{
    void water(){  // 물뿌리는 기능
        System.out.println("water~.~");
    }
}