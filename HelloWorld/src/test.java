import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class test {
    public static void main(String[] args) {
        int sum=0, x=1;
        while(x++ < 10){
        sum += x;
        }
        System.out.print("x : "+ x);
        System.out.println(", 총합 : "+ sum);
        }
}
