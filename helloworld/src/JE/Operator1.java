package JE;

public class Operator1 {
    public static void main(String[] args) {
        
        // 산술 변환: 연산 전에 피 연산자의 타입을 일치시키는 것
        // long + int -> long + long
        // float + int -> float + float
        // double + float -> double + double

        // 피연산자의 타입이 int보다 작은 타입이면 int로 변환
        // byte + short -> int + int
        // char + short -> int + int
    }
}

class Round{
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi*1000)/1000.0;  
        // Math.round(3.141592*1000)/1000.0
        // Math.round(3141.592)/1000.0
        // 3142/1000.0 => 3.14
        System.out.println(shortPi);  
    }
}

class remainder{
    public static void main(String[] args) {
        int x = 10, y = 8;
        System.out.printf("%d를 %d로 나누면, %n", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x/y, x%y);  // 나머지 연산자 %

    }
}

class compare{
    public static void main(String[] args) {
        
        // 문자열의 비교에는 equals()사용
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

    }
}

class condition{
    public static void main(String[] args) {
        int result = (5>3)?5:3;  // 괄호 생략 가능
        System.out.println(result);
    }
}