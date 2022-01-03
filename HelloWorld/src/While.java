import java.util.Scanner;
public class While {
    public static void main(String[] args) {
    //     int i=1;
    //     while(i<=10){
    //         System.out.println(i+": 현재숫자");
    //         i++;
    //     }

    int sum=0, odd=0, even=0;
    int i=1;
    while(i<=100){
        sum +=1;
        if(i%2 == 0){
            even += i;
        } else{
            odd += i;
        }
        i++;
    }
    System.out.println("1~100 합 = "+sum);
    System.out.println("1~100 짝수합 = "+even);
    System.out.println("1~100 홀수합 = "+odd);

    }
}
class WhileEx03 {
	public static void main(String[] args) {
		boolean stop = false;
		int num;
		while (!stop) { // true를 의미
			System.out.println("2개의 정수 입력");
			Scanner sc = new Scanner(System.in); // Scanner 객체 생성
			int num1 = sc.nextInt(); // 콘솔창을 통해 값을 입력을 받음
			int num2 = sc.nextInt(); // 콘솔창을 통해 값을 입력을 받음
			num = num1 % num2; // 나머지 구하는 공식
			System.out.println(num1 + " % " + num2 + " = " + num);
			System.out.println("계속 Y, 종료 N 입력");
			String yn = sc.next(); // 콘솔창을 통해 값을 입력을 받음
			if (yn.equals("Y") || yn.equals("y")) { // Y 또는 y 입력시 반복
				System.out.println("---------------------");
				continue; // 보조제어문(반복 계속)
			}
			if (yn.equals("N") || yn.equals("n")) { // N 또는 n 입력시 종료
				break; // 보조제어문(반복 종료)
			}
		}
		System.out.println("시스템이 종료되었습니다.");

	}
}