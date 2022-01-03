package JE;
import java.util.*;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println("숫자는:"+num);

        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        System.out.println("숫자는:"+num);

    }
}
