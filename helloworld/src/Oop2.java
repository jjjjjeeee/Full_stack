public class Oop2 {
    public static void main(String[] args) {
        Product p1 = new Product(2000000);
        System.out.println("hello world");

    }
}

class Product {
   String color;
   boolean motor;
   int width;
   int height;
   int depth;
   int price;

   Product(int price){
       this(price, true, "red");
       System.out.println("This is construct func");
       this.price = price;
       System.out.println(price);
   }

   Product(int price, boolean motor, String color){
       System.out.println("This is construct func");
       this.price = price;
       this.motor = motor;
       this.color = color;
       System.out.println(price);
       System.out.println(motor);
       System.out.println(color);
    
       System.out.println("이 오토바이의 가격: "+this.price);


   }

}

class Car{
    String color;
    String gearType;
    int door;

    Car (){}
    Car(String c, String g, int d){
        this.color = c;
        this.gearType = g;
        this.door = d;
    }
}

class CarTest{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("red", "auto", 10);
        System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
        System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);

    }
}