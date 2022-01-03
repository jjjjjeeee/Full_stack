class Parent2{
    void display(){
        System.out.print("부모 클래스의 display() 메소드");
    }
}

class Child2 extends Parent2{
    void display(){
        System.out.println("자식 클래스의 display() 메소드");
    }
    void display(String str) { //String str => 매개변수
        System.out.println(str);
    }
}
public class Inheritance06 {
    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.display();
        ch.display("오버로딩된 display() 메소드");
        }
}
