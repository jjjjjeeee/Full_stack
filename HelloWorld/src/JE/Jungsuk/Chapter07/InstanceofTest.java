package JE.Jungsuk.Chapter07;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine1 fe1 = new FireEngine1();

        if(fe1 Instanceof FireEngine1){
            System.out.println("This is a FireEngine instance");
        }

        if(fe1 Instanceof Car1){
            System.out.println("This is a Car instance");
        }
        
        if(fe1 Instanceof Object){
            System.out.println("This is a Object instance");
        }

        System.out.println(fe1.getClass().getName()); // 클래스의 이름을 출력
    }
}

class Car1{}

class FireEngine1 extends Car1{}
