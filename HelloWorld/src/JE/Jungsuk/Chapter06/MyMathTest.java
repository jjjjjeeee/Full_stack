package JE.Jungsuk.Chapter06;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1= mm.add(4L,2L);
        long result2= mm.subtract(4L,2L);
        long result3= mm.multiply(4L,2L);
        double result4= mm.divide(4L,2L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}

class MyMath{
    long add(long a, long b){
        long result = a+b;
        return result;
        // return a+b; 위의 두 줄을 간단히 한 것
    }

    long subtract(long a, long b){ return a-b; }
    long multiply(long a, long b){ return a*b; }
    double divide(long a, long b){ return a/b; }
}
