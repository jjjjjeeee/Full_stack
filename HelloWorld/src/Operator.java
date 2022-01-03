public class Operator {
    public static void main(String[] args) {
        
        // 증감연산자
        int i = 5;
        i++;
        System.out.println(i); //6
        i = i+1;
        System.out.println(i); //7
        i--;
        System.out.println(i); //6
        i = i-1;
        System.out.println(i); //5
        System.out.println(i++); //5
        System.out.println(i); //5

        i = -10;
        System.out.println(i);
        i = +i;
        System.out.println(i); //-10(현상유지)
        i = -i;
        System.out.println(i); //10

        boolean power = false;
        System.out.println(power);
        power = !power;
        System.out.println(power); //true
        power = !power;
        System.out.println(power); //false

        // 삼항연산자
        int x = -10;
        int absX = x>=0?x:-x;
    }
}
