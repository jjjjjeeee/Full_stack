package Chapter06;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3]; // 길이가 3인 tv객체 배열

        // tv객체를 생성해서 tv객체 배열의 각 요소에 저장
        for(int i=0; i<tvArr.length; i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10;
        }
        
        for(int i=0; i<tvArr.length; i++){
            tvArr[i].channelUp(); // 채널이 1증가
            System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
        }
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