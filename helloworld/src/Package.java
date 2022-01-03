import Car.Sports.람보르기니;
// import java.util.Scanner;
// import java.util.*;


public class Package {
    public static void main(String[] args) {
        람보르기니 l1 = new 람보르기니();
        람보르기니 l2 = new 람보르기니();
        람보르기니 l3 = new 람보르기니();

        l1.setName("1번 람보르기니");
        l2.setName("2번 람보르기니");
        l3.setName("3번 람보르기니");

        System.out.println(l1.getName());
        System.out.println(l2.getName());
        System.out.println(l3.getName());

        l1.setPrice(1000000000);
        l1.setPrice(1100000000);
        l1.setPrice(1200000000);

        System.out.println(l1.getPrice());
        System.out.println(l2.getPrice());
        System.out.println(l3.getPrice());

    }
}
