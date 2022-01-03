import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        if (true) {
            System.out.println("실행 1");
        }

        if (false) {
            System.out.println("실행 2");
            System.out.println("실행 3");
        }

        int a = 6;
        if (a % 2 == 0) {
            System.out.println(a + "는 2의 배수");
        }
    }
}

class IfExam1 {
    public static void main(String[] args) {

        int a;
        System.out.print("숫자를 하나 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();

        a = Integer.parseInt(tmp);

        if (a < 10) {
            System.out.println(a + "는 10보다 작습니다.");
        } else {
            System.out.println(a + "는 10보다 큽니다.");

        }
    }
}

class IFElse {
    public static void main(String[] args){

        // int money = 2000;
        // if (money >= 3000) {
        //     System.out.println("택시를 타고 가라");
        // }
        // else {
        //     System.out.println("걸어가라");
        // }



        // 문제 
        // System.out.println("숫자를 입력하세요");

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();

        // if (a%2 == 0){
        //     System.out.println("짝수입니다");
        // } else {
        //     System.out.println("홀수입니다.");
        // }
        // sc.close();

        // 문제
        // double dValue = Math.random();
        // int randomValue = (int)(dValue*100);
        // System.out.println(randomValue);

        // if (randomValue<=60){
        //     System.out.println("가");
        // } else if (randomValue>=70){
        //     System.out.println("양");
        // } else if (randomValue>=80){
        //     System.out.println("미");
        // } else if (randomValue>=90){
        //     System.out.println("우");
        // } else{
        //     System.out.println("수");
    // }

    //문제) 정수 3개를 비교하여 최댓값을 구하시오
//     int a = 10, b = 20, c = 9;
//     int max;

//     if(a>b && a>c){
//         max = a;
//     } else {
//         if (b>c) {
//             max = b;
//         } else {
//             max = c;
//         }
//     }
//     System.out.println("max =" + max);
// }
Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max = a;
        if( b > max ) max = b;
        if( c > max ) max = c;
        
        System.out.println("최댓값은" + max);
    }
}

class ElseIf {
    public static void main (String[] args) {
        // int age = 22;
        // if (age >= 20 && age <30) {
        //     System.out.println("20대");
        // } else if (age <20) {
        //     System.out.println("10대 이하"); 
        // } else if (age >29 && age <40) {
        //     System.out.println("30대");
        // } else if (age >39 && age <50) {
        //     System.out.println("40대");
        // } else if (age >49 && age <60) {
        //     System.out.println("50대");
        // } else {
        //     System.out.println("60대 이상");
        // }

        // 문제) else if를 사용하여 주사위의 번호를 뽑으시오
        // int num = (int)(Math.random()*6)+1;
        // if (num == 1){
        //     System.out.println(num+"번이 나왔습니다.");
        // } else if (num == 1){
        //     System.out.println(num+"번이 나왔습니다.");
        // } else if (num == 2){
        //     System.out.println(num+"번이 나왔습니다.");
        // } else if (num == 3){
        //     System.out.println(num+"번이 나왔습니다.");
        // } else if (num == 4){
        //     System.out.println(num+"번이 나왔습니다.");
        // } else if (num == 5){
        //     System.out.println(num+"번이 나왔습니다.");
        // } else {
        //     System.out.println(num+"번이 나왔습니다.");
        // }


        // 문제) userID가 1이면 관리자 2이면 판매자 3이면 구매자이다. userID를 확인하여 누가 로그인했는지 출력하시오.
        
        // Scanner sc = new Scanner (System.in);
        // int userID = sc.nextInt();
        // if (userID == 1) {
        //     System.out.println("관리자로 로그인");
        // } else if (userID == 2) {
        //     System.out.println("판매자로 로그인");
        // } else {
        //     System.out.println("구매자로 로그인");
        // }

    }
}