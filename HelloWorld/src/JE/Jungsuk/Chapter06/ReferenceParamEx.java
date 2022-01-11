package JE.Jungsuk.Chapter06;


class Data {int x;}

public class ReferenceParamEx {
    public static void main(String[] args) {
        
        Data d =  new Data();
        d.x = 10;
        System.out.println("main(): x = "+d.x);

        change(d);
        System.out.println("after change(d)");
        System.out.println("main(): x = "+d.x);
    }

    static void change(Data d) {  
        // 참조형 매개변수(객체의 주소), 값변경 가능
        d.x=1000;
        System.out.println("change() :  x = "+d.x);
    }
}

