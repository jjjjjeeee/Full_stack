package JE.Jungsuk.Chapter09;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if (p1==p2)
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");

        if(p1.equals(p2)) 
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");

    }
}

class Person{
    long id;

    // equals메서드가 Person인스턴스의 주소값이 아닌 멤버변수 id의 값을 비교
    // equals메서드를 오버라이딩
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person)
            return id == ((Person)obj).id; 
            // obj가 Object타입이므로 id값을 참조하기 위해서는 Person타입으로 형변환 필요
        else
            return false;
    }

    Person(long id){
        this.id = id;
    }
}


