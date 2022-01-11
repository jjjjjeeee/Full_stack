package JE.Jungsuk.Chapter09;

public class EqualsEx1 {
    public static void main(String[] args) {
    
    // 서로 다른 두 객체를 equals메서드로 비교하면 항상 false
    Value v1 = new Value(10);
    Value v2 = new Value(10);
    
    if (v1.equals(v2)) {
        System.out.println("v1과 v2는 같음");
    } else {
        System.out.println("v1과 v2는 다름");
    } // 결과: v1과 v2는 다름

    v2=v1;
    
    if (v1.equals(v2)) {
        System.out.println("v1과 v2는 같음");
    } else {
        System.out.println("v1과 v2는 다름"); 
    } // 결과: v1과 v2는 같음
    }
}

class Value{
    int value;

    Value(int value){
        this.value = value;
    }
}
