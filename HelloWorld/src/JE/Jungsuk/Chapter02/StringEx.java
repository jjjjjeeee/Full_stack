package JE.Jungsuk.Chapter02;

public class StringEx {
    public static void main(String[] args) {

        // 문자열+any type => 문자열+문자열
        String name = "Ja"+"Va";
        String str = name+8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7+" ");
        System.out.println(" "+7);
        System.out.println(7+"");
        System.out.println(""+7);
        System.out.println(""+"");
        System.out.println(7+7+"");
        System.out.println(""+7+7);
    }
}
