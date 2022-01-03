package JE;
import java.util.*
;
public class Condition {
    public static void main(String[] args) {
        // 조건문: if
        // 반복문: while
        int score = 0; //정수를 저장하기 위한 변수
        char grade = ' ';  //학점을 저장하기 위한 변수, 공백으로 초기화

        System.out.print("점수를 입력하세요!");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if (score >= 90){
            grade = 'A';
        } else if (score >=80){
            grade = 'B';
        } else if (score >=60){
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 "+grade+"입니다.");

    }
}

class double1{
    public static void main(String[] args) {

        // 중첩 if문
        int score = 0; //정수를 저장하기 위한 변수
        char grade = ' ', opt = '0';  //학점을 저장하기 위한 변수, 공백으로 초기화

        System.out.print("점수를 입력하세요!");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt(); // 화면을 통해 입력받은 점수를 score에 저장

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if (score >= 90){
            grade = 'A';
            if (score >=98){
                opt = '+';
            } else if (score <94){
                opt = '-';
            }
        } else if (score >=80){
            grade = 'B';
        } else if (score >=60){
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 "+grade+opt+"입니다."); 
    }
}


class switch1{
    public static void main(String[] args) {
        // 제약조건
        // 1. 조건식 결과는 정수 또는 문자열
        // 2. case문의 값은 정수 상수(문자 포함) 문자열만 가능하며 중복 불가
        int num, result;
        final int ONE = 1;
        switch (result) {
            case '1': // 가능(정수 49와 동일)
            case ONE: // 가능 (정수 상수)
            case "YES": // 가능(jdk1.7부터 허용)
            case num: // 불가(변수는 불가)
            case 1.0 // 불가(실수도 불가)
        }
    }
}

class random{
    public static void main(String[] args) {
        // 1~3값을 구하고 싶은 경우
        // 1) 각 변에 3을 곱함
        // 2) 각 변을 int형으로 변환
        // 3) 각 변에 1을 더함

        // 1~10까지의 난수를 10개 출력하시오
        // int num = 0;
        // for(int i=1;i<=10;i++){
        //     System.out.println((int)(Math.random()*10+1)); //1~10까지 값 추출
        // }

        // -5~5사이의 난수를 10개 출력하시오
        int num = 0;
        for(int i=1;i<=10;i++){
            System.out.println((int)(Math.random()*11)-5); //-5~5까지 값 추출
        }

    }
}