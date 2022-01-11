package JE.Jungsuk.Chapter06;

class Car {
    String color;
    String gearType;
    int door;
    
    Car(){}
    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}
public class CarTest {
    public static void main(String[] args) {
        
    Car c1 = new Car();
    c1.color = "white";
    c1.gearType = "auto";
    c1.door = 4;

    Car c2 = new Car("red", "manual", 2);

    System.out.println("c1의 color = "+c1.color+", c1의 gearType = "+c1.gearType+", c1의 door = "+c1.door);
    System.out.println("c2의 color = "+c2.color+", c2의 gearType = "+c2.gearType+", c1의 door = "+c2.door);

    }
}
