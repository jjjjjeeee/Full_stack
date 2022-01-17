package Chapter06;

public class TvTest3 {
    public static void main(String[] args) {

        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 "+t1.channel+"번 입니다.");
        System.out.println("t2의 channel값은 "+t2.channel+"번 입니다.");

        t2 = t1;
        t1.channel = 7;
        System.out.println("t1의 channel값을 "+t1.channel+"로 변경했습니다.");

        System.out.println("t1의 channel값은 "+t1.channel+"번 입니다.");
        System.out.println("t2의 channel값은 "+t2.channel+"번 입니다.");
    }
}

class Tv{

    // tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // tv의 기능(메서드)
    void power(){power =! power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}

}
