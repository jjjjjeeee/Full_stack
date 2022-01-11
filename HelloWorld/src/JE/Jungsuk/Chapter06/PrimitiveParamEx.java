package JE.Jungsuk.Chapter06;

class Data{ int x; }

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d =  new Data();
        d.x = 10;
        System.out.println("main(): x = "+d.x);

        change(d.x);
        System.out.println("after change(d.x)");
        System.out.println("main(): x = "+d.x);
    }

    static void change(int x) {  
        // 기본형 매개변수, 값이 변하지 않음
        // d.x의 값이 변경된 것이 아니라 change메서드의 값이 변경된 것
        x=1000;
        System.out.println("change() :  x = "+x);
    }
}
