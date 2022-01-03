package JE;

public class For1 {
    public static void main(String[] args) {
        
        //for(초기화;조건식;증감식)
        // for (int i=1; i<=10; i=i*2){
        //     System.out.println(("Hi"));
        // }

        for (int i=1,j=10; i<=10; i++,j--){
            System.out.println("i="+i+"\t"+"j="+j);
        }

        int sum = 0;
        for (int i=1; i<=5; i++){
            sum += i;  // sum = sum+1
            System.out.printf("1부터 %2d 까지의 합: %2d%n", i,sum);
        }
    }
}

class double2{
    public static void main(String[] args) {
        // 중첩 for
        for(int i=2; i<5; i++){
            for(int j=1; j<10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
