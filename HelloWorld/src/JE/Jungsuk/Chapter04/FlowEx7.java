package JE.Jungsuk.Chapter04;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt(); // 화면을 통해 입력받은 숫자를 user에 저장
        int com = (int)(Math.random()*3)+1; // 1,2,3 중 하나가 com에 저장

        System.out.println("당신은 "+user+"입니다.");
        System.out.println("컴은 "+com+"입니다.");

        switch(user-com){
            case 2: case -1:
            System.out.println("you lose");
            break;
            
            case 1: case -2:
            System.out.println("you win");
            break;
            
            case 0:
            System.out.println("draw");
            break;
            
        }
    }
}
