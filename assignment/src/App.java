class Car{
    String color;
    int door;
    
    void drive(){
        System.out.println("drive~~~");
    }
    
    void stop(){
        System.out.println("Stop!!!");
    }
}

class tunnin extends Car{
    static int seat = 2;
}

public class App{
    public static void main(String[] args) {
    Car car = new Car();
    car.color = "red";
    car.door = 4;
    car.drive();
    car.stop();       

    }
}