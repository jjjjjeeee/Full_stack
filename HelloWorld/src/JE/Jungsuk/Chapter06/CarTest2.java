package JE.Jungsuk.Chapter06;

class Car1 {
    String color;
    String gearType;
    int door;

    Car1(){
        this("white", "auto",4); // Car(string color, String gearType, int door)를 호출
    }

    Car1(String color){
        this(color, "auto", 4);
    }

    Car1(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        Car1 c2 = new Car1("blue");

        System.out.println("c1의 color = "+c1.color+", c1의 gearType = "+c1.gearType+", c1의 door = "+c1.door);
        System.out.println("c2의 color = "+c2.color+", c2의 gearType = "+c2.gearType+", c1의 door = "+c2.door);
    
    }
}
