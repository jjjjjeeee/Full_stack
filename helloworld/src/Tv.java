class TV{
    boolean power;
    int channel;
    void channelUp(){
        ++channel;
    };
    void channelDown(){
        --channel;
    };
}

public class Tv{
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
