package JE.Jungsuk.Chapter07;

public class BindingTest2 {
    public static void main(String[] args) {
        Child1 p1 = new Child1();
        Child1 c1 = new Child1();

        System.out.println("p.x="+p1.x);
        p1.method();
        
        System.out.println("c.x="+c1.x);
        c1.method();
    }
}

class Parent1 {
    int x=100;
    void method(){System.out.println("Parent method");
    }
}

class Child1 extends Parent1{}