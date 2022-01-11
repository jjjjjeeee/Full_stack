package JE.Jungsuk.Chapter07;

class Tv{
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption) { // 캡션 상태가 on(true)일 때만 text를 보여줌
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel=10;  // 조상클래스로 상속
        ctv.channelUp(); // 조상클래스로 상속
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello World"); 
        ctv.caption = true; // 캡션(자막) 기능을 켬
        ctv.displayCaption("Hello World");
    }
}
