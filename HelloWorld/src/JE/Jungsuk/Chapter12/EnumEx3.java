package JE.Jungsuk.Chapter12;

enum Transportation1 {
    BUS(100) { int fare(int distance) { return distance*BASIC_FARE;}}
    TRAIN(150) { int fare(int distance) { return distance*BASIC_FARE;}}
    SHIP(100) { int fare(int distance) { return distance*BASIC_FARE;}}
    AIRPLANE(300) { int fare(int distance) { return distance*BASIC_FARE;}}

    protected final int BASIC_FARE; // protected로 해야 각 상수에서 접근가능

    Transportation1(int basicfare) { // private Transportation(int basicFare)
        BASIC_FARE = basicfare;
    }

    public int getBasicFare() {return BASIC_FARE;}

    abstract int fare(int distance); // 거리에 따른 요금 계산
}

public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("bus fare="+Transportation1.BUS.fare(100));
        System.out.println("train fare="+Transportation1.TRAIN.fare(100));
        System.out.println("ship fare="+Transportation1.SHIP.fare(100));
        System.out.println("airplane fare="+Transportation1.AIRPLANE.fare(100));
    }
}
