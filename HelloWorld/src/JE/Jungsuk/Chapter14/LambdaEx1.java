package JE.Jungsuk.Chapter14;

@FunctionalInterface
interface MyFuntional {
    void run(); // public abstract void run();
}
public class LambdaEx1 {
    static void execute (MyFuntion f){ // 매개변수의 타입이 MyFuntion인 메서드
        f.run();
    }

    static MyFuntion getMyFuntion() { // 반환 타입이 MyFuntion인 메서드
        MyFuntion f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        // 람다식으로 MyFuntion의 run()을 구현
        MyFuntion f1 = ()->System.out.println("f1.run()");

        MyFuntion f2 = new MyFuntion() { // 익명클래스로 run()을 구현
            public void run() { //public을 반드시 붙여야 함
                System.out.println("f2.run()");
            }
        };
        MyFuntion f3 = getMyFuntion();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute( ()->System.out.println("run()"));
    }
}
