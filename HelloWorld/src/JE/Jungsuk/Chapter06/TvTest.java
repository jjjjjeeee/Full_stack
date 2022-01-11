package JE.Jungsuk.Chapter06;

class Tv{
    // tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // tv의 기능(메서드)
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
public class TvTest {
    public static void main(String[] args) {
        
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널: "+t.channel);
    }
}
