package JE;
import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        
        // while: 조건을 만족시키는 동안 {}을 반복
        int i=5; // 초기값 설정
        while(i--!=0){
            System.out.println(i+"- I can do it");
        }
    }
}

class whilesum{
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        // i를 1씩 증가시켜서 sum에 계속 더함
        while(sum <= 100){
            System.out.printf("%d - %d%n", i, sum);
            sum += ++i;
        }
    }
}


class input1{
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요");

        Scanner scanner = new Scanner(System.in);
        String tmp = "12345"; // 화면을 통해 입력받은 내용을 tmp에 저장
        num = 12345;

        while(num!=0){
            //num을 10으로 나눈 나머지를 sum에 더함
            sum += num%10; // sum = sum + num%10;
            System.out.printf("sum=3% num=%d%n", sum, num);

            num /= 10; // num = num/10;
        }
        System.out.println("각 자리수의 합:"+sum);
    }
}


class break1{
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while(true){
            if(sum>100)
                break;
            ++i;
            sum += i;
        }
        System.out.println("i="+i);
        System.out.println("sum="+sum);
    }
}