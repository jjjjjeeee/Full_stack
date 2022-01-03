package JE;

public class Method1 {
    public static void main(String[] args) {
        
        MyMath mm = new MyMath();

        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        long result = mm.max(5,3);

        System.out.println("add(5L,3L) = "+result1);
        System.out.println("subtract(5L,3L) = "+result2);
        System.out.println("multiply(5L,3L) = "+result3);
        System.out.println("divide(5L,3L) = "+result4);
        System.out.println("max(5L,3L) = "+result);

        mm.printgugudan(3);
    }
}

class MyMath{

    void printgugudan(int dan){
        if(!(2>dan && dan<=9))
            return;  // 입력받은 dan이 2~9 아니면, 메서드 종료하고 돌아가기

        for(int i=1; i<=9; i++){
            System.out.printf("%d*%d = %d%n", dan, i , dan*i);
        }
    }
    
    long add(long a, long b){
        long result = a+b;
        return(result);
    }
    // return a+b => 위의 코드를 이처럼 간단히 할 수 있음
    long subtract (long a, long b) {return a-b;}
    long multiply (long a, long b) {return a*b;}
    double divide(double a, double b) {return a/b;}


    // 두 값을 받아서 둘 중에 큰 값을 반환하는 메서드
    long max (long a, long b){
        long result = 0;
        result = a>b?a:b;
        return result;
        // return a>b?a:b; 위 두 줄과 같음 
    }
}