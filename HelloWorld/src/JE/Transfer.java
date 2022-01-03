package JE;

public class Transfer {
    public static void main(String[] args) {

        //결과 값 꼭 확인하기
        String str = "3";
        System.out.println(str.charAt(0)-'0'); // 문자 -> 숫자 변환
        System.out.println(3-'0'+1); // 문자 -> 숫자 변환 + 1
        System.out.println(Integer.parseInt("3")+1); // 숫자+숫자
        System.out.println("3"+"1"); // 문자+문자
        System.out.println(3+'0'); // 0은 숫자로 48

    }
}

class Transfer2{
    public static void main(String[] args) {

        // 형변환 연산자
        int i =65;
        char ch = (char)i;
        System.out.println(ch);

        float f = 3.2534f;
        int n = (int)f;  // 수동 형변환 (큰 값을 작은 그릇에 담을 때는 자동형변환 불가)
        System.out.println(n);  // 값손실 발생

        float fl =1234;
        float f1 = (float)1234; // 자동 형변환 (작은 것을 큰 것에 담을 때 자동 형변환됨)
    }
}