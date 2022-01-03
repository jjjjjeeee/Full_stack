import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        
        // 5. 변수 ~ 6. 리터럴과 접미사
        int score = 100;
        System.out.println(score);
        score = 200;
        System.out.println(score);
        char ch = 'A';
        System.out.println(ch);
        String str = "abc";
        System.out.println(str);
        final int MAX = 100;
        System.out.println(MAX);
        
        boolean power = true;
        System.out.println(power);
        ch = 'A';
        System.out.println(ch);
        ch = '\u0041';
        System.out.println(ch);
        char tab = '\t';
        System.out.println(tab);
        byte b = 127;
        System.out.println(b);
        short s = 32767;
        System.out.println(s);
        int i = 100;
        System.out.println(i);
        int oct = 0100;
        System.out.println(oct);
        int hex = 0x100;
        System.out.println(hex);
        
        long l = 10000000000L;
        System.out.println(l);
        float f = 3.14f;
        System.out.println(f);
        double d = 3.14d;
        System.out.println(d);
        f = 100f;
        System.out.println(f);

        // 8. 문자와 문자열
        ch = 'A';
        System.out.println(ch);
        // 에러 발생 ch = 'AB'; 
        String sl = "AB";
        System.out.println(sl);
        // 에러 발생 ch = '';
        sl = "";
        System.out.println(sl);
        sl = "A"+"B"; //"AB"
        System.out.println(sl);
        sl = ""+7; //"7"
        System.out.println(sl);
        System.out.println(""+7+7);
        System.out.println(7+7+"");

        // 오버플로우
        b = 127;
        b++; // b = b+1
        System.out.println(b); 

        // 10. 형변환(Casting)
        f = 1.6f;
        System.out.println(f);
        i = (int)f;
        System.out.println(i);

        ch = 'A';
        i = (int)ch;
        System.out.println(i);

        i = 65;
        ch = (int)'A';
        System.out.println(ch);

        i = 1;
        f = (float)1;
        System.out.println(f);

        i = 10;
        f = (float)10;
        System.out.println(f);

        b = 10;
        i = (int)b;
        System.out.println(i);

        int i2 = 300;
        byte b2 = (byte)i2;
        System.out.println(b2);

        // 11. 형식화된 출력 - printf()
        System.out.println(10.0/3);
        System.out.println(0x1A); //26 0X1A -> 16진법
        System.out.printf("%.2f", 10.0/3); //3.33
        System.out.printf("%d", 0x1A); //26
        System.out.printf("%X\n", 0x1A); //1A

        System.out.println(1);
        System.out.println(2);

        System.out.printf("1");
        System.out.printf("2");


        // 12. printf()의 지시자
        System.out.printf("age: %d year:%d\n", 14, 2017);
        int age = 101;
        System.out.printf("age:%d", age);
        System.out.printf("age:%d%n", age);
        System.out.printf("age:%d", age);

        System.out.printf("This state is &b", true);

        // 1) 정수를 10진수, 8진수, 16진수로 출력
        System.out.printf("%d%n", 15);  //15 10진수
        System.out.printf("%o%n", 15);  //17 8진수
        System.out.printf("%x%n", 15);  //f 16진수
        System.out.printf("%s%n", Integer.toBinaryString(15)); //1111 2진수

        // 2) 8진수와 16진수에 접두사 붙이기
        System.out.printf("%#o%n", 15);  //017
        System.out.printf("%#x%n", 15);  //0xf
        System.out.printf("%#X%n", 15);  //0XF

        // 3) 실수 출력을 위한 지시자 %f - 지수형식(%e), 간략한 형식(%g)
        f = 123.4567890f;
        System.out.printf("%f%n", f);  // 123.456787
        System.out.printf("%e%n", f);  // 1.234568e+02
        System.out.printf("%g%n", 123.456789);  //123.457
        System.out.printf("%g%n", 0.00000001);  //1.00000e-8


        System.out.printf("[%5d]%n", 10);  // [ 10]
        System.out.printf("[%-5d]%n", 10);  // [10 ]
        System.out.printf("[%05d]%n", 10);  // [00010]

        System.out.printf("d=%14.10f%n", d);  // 전체 14자리 중 소수점 아래 10자리
        
        String url = "www.codechoco.com";
        System.out.printf("[%s]%n", url);  // [www.codechoco.com]
        System.out.printf("[%20s]%n", url);  // [   www.codechoco.com]
        System.out.printf("[%-20s]%n", url);  // [www.codechoco.com   ]
        System.out.printf("[%.8s]%n", url);  // [www.code]

        // 13. 화면에서 입력받기 - Scanner
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);

        // scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        num = Integer.parseInt(input);
        System.out.println(num);

        scanner.close();

    }
}
