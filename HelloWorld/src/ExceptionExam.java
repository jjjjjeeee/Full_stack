import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExam {
    public static void main(String[] args) {

        // try { // 예외가 발생될만한 코드, 예외 처리 대상

        // } catch(FileNotFoundException e){ // FileNotFoundException이 발생했다면 여기서 처리

        // } catch(IOException e){ // IOException이 발생했다면 여기서 처리

        // } catch(Exception e){ // Exception이 발생했다면 여기서 처리

        // } finally{ // 어떤 예외가 발생하든 무조건 여기서 처리

        // }
    }
}

class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {

            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            } catch (Throwable e) {
                // 매개변수 쓰듯이( (int i) 처럼) 적힌 것으로 생각하면 됨
                // 편의상 exception의 e를 따온 것 뿐이라 굳이 e일 필요도 없음
                System.out.println("===>0");
            }
        }
    }
}

class ExceptionEx6 {
    public static void main(String args[]) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4); // 실행되지 않는다
        } catch (Exception e) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}

class ExceptionEx7 {
    public static void main(String args[]) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4); // 실행되지 않는다
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}

class ExceptionEx8 {
    public static void main(String args[]) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4); // 실행되지 않는다
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("true");
            System.out.println("예외메시지: " + ae.getMessage());
        }
        System.out.println(6);
    }
}

class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생");
            throw e; // 에러던짐
        } catch (Exception e) {
            System.out.println("예외메시지: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료");
    }
}

class ExceptionEx10 {
    public static void main(String args[]) {
        try {
            throw new Exception(); // 고의로 Exception을 발생시킨다.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ExceptionEx11 {
    public static void main(String args[]) {
        try {
            throw new RuntimeException("일부러 에러발생!!"); // 고의로 RuntimeException을 발생시킨다.
        } catch (Exception ae) {
            ae.printStackTrace();
        }
    }
}

class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1();
    }

    private static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        throw new Exception("에러 발생하는 연습");
    }
}

class ExceptionEx15 {
    public static void main(String[] args) {
        // command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
        File f = createFile(args[0]);
        System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("파일이름이 유효하지 않습니다.");
        } catch (Exception e) {
            // fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 한다.
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName); // File클래스의 객체를 만든다.
            createNewFile(f); // 생성된 객체를 이용해서 파일을 생성한다.
            return f;
        }
    } // createFile메서드의 끝

    static void createNewFile(File f) {
        try {
            f.createNewFile(); // 파일을 생성한다.
        } catch (Exception e) {
        }
    }
}

class ExceptionEx16 {
    public static void main(String[] args) {
        
    PrintWriter out = null;
    try {
        out = new PrintWriter(new FileWriter("OutFile.txt");
        out.println("이게 뭐지..");
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (out != null) 
            out.close();
        }
    }
 }

 class Exercise8_8 {
	public static void main(String[] args) {
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수

		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			
            try{
                input = new Scanner(System.in).nextInt();
                } catch(InputMismatchException e){
                System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
                continue;
                }
            
			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요 .");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요 .");
			} else {
				System.out.println("맞췄습니다 .");
				System.out.println("시도횟수는 " + count + "번입니다 .");
				break; // do-while문을 벗어난다
			}
		} while (true); 
        
	} 
} 